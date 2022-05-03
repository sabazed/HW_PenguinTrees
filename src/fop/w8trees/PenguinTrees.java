package fop.w8trees;

import java.util.Comparator;
import java.util.function.Predicate;

public class PenguinTrees {
    public static Tree<Penguin> getAgeTree() {
        Comparator<Penguin> comparator = new Comparator<Penguin>() {
            @Override
            public int compare(Penguin o1, Penguin o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        return new Tree<Penguin>(comparator);
    }

    public static Tree<Penguin> getHeightTree() {
        Comparator<Penguin> comparator = new Comparator<Penguin>() {
            @Override
            public int compare(Penguin o1, Penguin o2) {
                return (int) Math.signum(o2.getHeight() - o1.getHeight());
            }
        };

        return new Tree<Penguin>(comparator);
    }

    public static int getMinorsAmount(Tree<Penguin> tree) {
        Predicate<Penguin> predicate = new Predicate<Penguin>() {
            @Override
            public boolean test(Penguin penguin) {
                return penguin.getAge() < 5;
            }
        };

        return tree.countMatches(predicate);
    }

    public static Object[] getEvenNames(Tree<Penguin> tree) {
        Predicate<Penguin> predicate = new Predicate<Penguin>() {
            @Override
            public boolean test(Penguin penguin) {
                return penguin.getName().length() % 2 == 0;
            }
        };

        return tree.getAll(predicate);
    }
}
