package l4.comparators;

import java.util.Comparator;

public class GoldComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Sportsman)o1).getCountGold() -((Sportsman)o2).getCountGold();
    }
}
