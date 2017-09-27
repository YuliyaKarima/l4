package l4.comparators;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Sportsman)o1).getName().compareTo(((Sportsman)o2).getName());
    }
}
