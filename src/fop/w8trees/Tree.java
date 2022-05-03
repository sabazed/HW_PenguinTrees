package fop.w8trees;
import java.util.Comparator;
import java.util.function.Predicate;

public class Tree<T> {

    private Comparator<T> comp;
    private TreeElement<T> root;

    public Tree(Comparator<T> comp) {
        this.comp = comp;
        this.root = new Leaf<T>();
    }

    public void insert(T value) {

        if (value == null) {
            System.out.println("Invalid value inserted!");
            return;
        }

        root = root.insert(value, comp);

    }

    @Override
    public String toString() {
        return root.toString();
    }

    public int size() {
        return root.size();
    }

    public void remove(T value) {
        if (root instanceof InnerNode) {
            if (((InnerNode<T>) root).getInfo() == value) {
                root = new Leaf<>();
            }
            else root.remove(value, comp);
        }
    }
    
    public boolean contains(T value) {
        return root.contains(value, comp);
    }

    public int countMatches(Predicate<T> filter) {
        return root.countMatches(filter);
    }

    public T[] getAll(Predicate<T> filter) {
        // Generics und Arrays vertragen sich nicht besonders gut
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[countMatches(filter)];
        root.getAll(filter, array, 0);
        return array;
    }
}
