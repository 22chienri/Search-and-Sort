/*
Ryan Chien
Period 4
Search and Sort
NumSort
 */

public class NumSort {
    public static void main(String[] args) {
        // populate the array with random numbers
        int[] nums = new int[30];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 51);
        }
        // print the array before sorting
        System.out.println("The list before being sorted");
        print(nums);
        // sort the array
        insertionSort(nums);
        System.out.println();
        // print the array after sorting
        System.out.println("The list after being sorted");
        print(nums);
        // search for 27 in nums
        int found = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 27) {
                found = i + 1;
            }
        }
        // print the result
        if (found == -1) {
            System.out.println("27 is not in the list");
        }
        else {
            System.out.println("27 was found in position #" + found + " on the list");
        }
    }

    // print the array in a 5 rows by 6 columns format
    public static void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 6 == 0) {
                System.out.println();
            }
            System.out.printf("%4s", nums[i]);
        }
        System.out.println();
    }

    // sort the array using insertion sort
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] < temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }
}
