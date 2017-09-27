package l4.comparators;

/**
 * Class encapsulates some information about a sportsman: name, count of gold and silver medals
 */
public class Sportsman {
    private String name;
    private int countGold;
    private int countSilver;

    public Sportsman(String name, int countGold, int countSilver) {
        this.name = name;
        this.countGold = countGold;
        this.countSilver = countSilver;
    }

    public String getName() {
        return name;
    }

    public int getCountGold() {
        return countGold;
    }

    public int getCountSilver() {
        return countSilver;
    }

    public String toString() {
        return name + " has " + (countGold + countSilver) + " medals: " + countGold + " gold medals and " +
                +countSilver + " silver medals.";
    }
}
