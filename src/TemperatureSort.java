/*
Ryan Chien
Period 4
Search and Sort
TemperatureSort
 */

public class TemperatureSort {
    // array of months
    private static final String[] months = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    // array of temps
    private static final Integer[] temps = {
        -8, 3, 18, 39, 61, 72, 74, 65, 52, 28, 3, -5
    };

    // sort temps in ascending order and keep months in sync
    public static void main(String[] args) {
        // sort temps in ascending order
        for (int i = 0; i < temps.length; i++) {
            // find the index of the smallest element in temps
            int minIndex = i;
            for (int j = i + 1; j < temps.length; j++) {
                if (temps[j] < temps[minIndex]) {
                    minIndex = j;
                }
            }
            // swap temps[i] and temps[minIndex]
            int temp = temps[i];
            temps[i] = temps[minIndex];
            temps[minIndex] = temp;
            // swap months[i] and months[minIndex] to keep in sync
            String month = months[i];
            months[i] = months[minIndex];
            months[minIndex] = month;
        }
        // print sorted temps and months
        System.out.println("*** Average Temperature for Fort Yukon, Alaska by Month ***");
        for (int i = 0; i < temps.length; i++) {
            System.out.println(months[i] + ": " + temps[i]);
        }
    }
}
