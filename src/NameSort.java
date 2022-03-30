/*
Ryan Chien
Period 4
Search and Sort
NameSort
 */

public class NameSort {
    public static void main(String[] args) {
        String[] names = {"Chloe", "Sabrina", "James", "Ralph", "Malcom", "Agnes", "Heidi", "Clarence", "Rhonda", "Lorenzo"};
        System.out.println("The list before being sorted");
        printNames(names);
        System.out.println("The list after being sorted");
        selectionSort(names);
        printNames(names);
        System.out.println("Ralph has been replaced by Rafael");
        // replace Ralph with Rafael in names
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Ralph")) {
                names[i] = "Rafael";
            }
        }
        printNames(names);
    }

    public static void selectionSort(String[] names) {
        for (int i = 0; i < names.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // swap names[i] and names[minIndex]
            String temp = names[i];
            names[i] = names[minIndex];
            names[minIndex] = temp;
        }
    }

    public static void printNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s", names[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
