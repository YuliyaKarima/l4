package l4.comparators;

import java.util.Comparator;

public class AllMedalsComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int firstCount = ((Sportsman) o1).getCountGold() + ((Sportsman) o1).getCountSilver();
        int secondCount = ((Sportsman) o2).getCountGold() + ((Sportsman) o2).getCountSilver();
        if (firstCount == secondCount) {
            return ((Sportsman) o1).getName().compareTo(((Sportsman) o2).getName());
        } else {
            return firstCount - secondCount;
        }
    }
}
