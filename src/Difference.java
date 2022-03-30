/*
Ryan Chien
Period 4
Search and Sort
Difference
 */

public class Difference {
    // print array in 4 rows and 5 columns format
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%-4d", array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // create array of 20 random integers
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        printArray(array);
        // find max and min of array
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        // print the result
        System.out.println(max + " - " + min + " = " + (max - min));
    }
}
