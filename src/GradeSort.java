/*
Ryan Chien
Period 4
Search and Sort
GradeSort
 */

public class GradeSort {
    public static void main(String[] args) {
        // create an array of grades
        int[] grades = new int[40];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) (Math.random() * 51 + 50);
        }
        System.out.println("*** Student Grades ***");
        printGrades(grades);
        System.out.println();
        System.out.println("*** Student Grades in descending order ***");
        selectionSort(grades);
        printGrades(grades);
        System.out.println();
        // calculate average grade
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        int average = sum / grades.length;
        // count how many grades are the same, above, or below the average
        int same = 0;
        int above = 0;
        int below = 0;
        for (int grade : grades) {
            if (grade == average) {
                same++;
            }
            if (grade > average) {
                above++;
            }
            if (grade < average) {
                below++;
            }
        }
        System.out.println("The average grade is " + average);
        System.out.println();
        System.out.println("Number of Students that have the average grade: " + same);
        System.out.println("Number of students above the average grade: " + above);
        System.out.println("Number of students below the average grade: " + below);
        System.out.println("The highest grade is " + grades[0]);
        System.out.println("The lowest grade is " + grades[grades.length - 1]);
    }

    // use selection sort to sort array from big to small
    public static void selectionSort(int[] grades) {
        for (int i = 0; i < grades.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[j] > grades[max]) {
                    max = j;
                }
            }
            int temp = grades[i];
            grades[i] = grades[max];
            grades[max] = temp;
        }
    }

    // print array grades in 8 rows by 5 columns format
    public static void printGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%-4d", grades[i]);
        }
        System.out.println();
    }
}
