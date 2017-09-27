package l4.comparators;

import java.util.Arrays;

public class TestSportsman {
    public static void main(String[] args) {
        //creating new array ofsportsmen
        Sportsman[] sportsmen = new Sportsman[4];
        //initializing each element in array of sportsmen
        sportsmen[0] = new Sportsman("Cristiano Ronaldo", 10, 6);
        sportsmen[1] = new Sportsman("Iker Casillas", 20, 5);
        sportsmen[2] = new Sportsman("David Silva", 6, 6);
        sportsmen[3] = new Sportsman("Mesut Ozil", 8, 8);
        //creating Comparator objects
        NameComparator nameCompare = new NameComparator();
        GoldComparator goldCompare = new GoldComparator();
        AllMedalsComparator allMedalsCompare = new AllMedalsComparator();
        //sorting by name
        System.out.println("Sorting by sportsmen's name:");
        Arrays.sort(sportsmen, nameCompare);
        printArray(sportsmen);
        //sorting by gold medals amount
        System.out.println("Sorting by amount of gold medals:");
        Arrays.sort(sportsmen, goldCompare);
        printArray(sportsmen);
        //sorting by amount of both gold and silver medals
        System.out.println("Sorting by amount of all medals:");
        Arrays.sort(sportsmen, allMedalsCompare);
        printArray(sportsmen);
    }

    /**
     * Prints arrays elements
     *
     * @param sportsmen array of type l4.comparators.Sportsman
     */
    private static void printArray(Sportsman[] sportsmen) {
        System.out.println("Sportsmen in the list:");
        for (int i = 0; i < sportsmen.length; i++) {
            System.out.println(sportsmen[i]);
        }
    }
}
