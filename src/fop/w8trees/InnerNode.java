package fop.w8trees;

import java.util.Comparator;
import java.util.function.Predicate;

public class InnerNode<T> implements TreeElement<T> {

    private TreeElement<T> left, right;
    private T info;

    public InnerNode(T info) {
        this.left = new Leaf<T>();
        this.right = new Leaf<T>();
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    @Override
    public InnerNode<T> insert(T value, Comparator<T> comp) {
        if (comp.compare(info, value) < 0) {
            right = right.insert(value, comp);
        }
        else {
            left = left.insert(value, comp);
        }

        return this;

    }

    @Override
    public void toString(StringBuilder sb) {
        left.toString(sb);
        sb.append(info + ",");
        right.toString(sb);
    }

    @Override
    public int size() {
        return left.size() + 1 + right.size();
     }

    @Override
    public T getMin() {
        return null;
    }

    @Override
    public TreeElement<T> remove(T value, Comparator<T> comp) {
        if (comp.compare(info, value) < 0 && right instanceof InnerNode) return this.removeLast(value, comp, null, this);
        else if (comp.compare(info, value) > 0 && left instanceof InnerNode) return this.removeLast(value, comp, this, null);
        return this;
    }

    public TreeElement<T> removeLast(T value, Comparator<T> comp, InnerNode<T> lastNodeFromLeft, InnerNode<T> lastNodeFromRight) {
        if (comp.compare(info, value) > 0 && left instanceof InnerNode) {
            ((InnerNode) left).removeLast(value, comp, this, null);
        }
        else if (comp.compare(info, value) < 0 && right instanceof InnerNode) {
            ((InnerNode) right).removeLast(value, comp, null, this);
        }
        else {
            if (left instanceof Leaf && right instanceof InnerNode) {
                if (lastNodeFromLeft == null) {
                    lastNodeFromRight.right = right;
                }
                else lastNodeFromLeft.left = right;
            }
            else if (left instanceof InnerNode && right instanceof Leaf) {
                if (lastNodeFromLeft == null) {
                    lastNodeFromRight.right = left;
                }
                else lastNodeFromLeft.left = left;
            }
            else {
                if (lastNodeFromLeft == null) {
                    lastNodeFromRight.right = new Leaf<>();
                }
                else lastNodeFromLeft.left = new Leaf<>();
            }
        }
        return this;
    }

    @Override
    public boolean contains(T value, Comparator<T> comp) {
        if (comp.compare(info, value) < 0) return right.contains(value, comp);
        else if (comp.compare(info, value) > 0) return left.contains(value, comp);
        return true;
    }

    @Override
    public int countMatches(Predicate<T> filter) {
        return left.countMatches(filter) + (filter.test(info) ? 1 : 0) + right.countMatches(filter);
    }

    @Override
    public int getAll(Predicate<T> filter, T[] array, int index) {
        index = left.getAll(filter, array, index);

        if (filter.test(info) == true) {
            array[index] = info;
            index++;
        }

        index = right.getAll(filter, array, index);

        return index;
    }
}
