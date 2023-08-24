import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];
        
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = scanner.nextInt();
            }
        }
        
        if (equals(list1, list2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }
    
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) {
            return false;
        }
        
        // Flatten both arrays and sort them
        int[] flatM1 = flattenAndSort(m1);
        int[] flatM2 = flattenAndSort(m2);
        
        // Compare the sorted flattened arrays
        return Arrays.equals(flatM1, flatM2);
    }
    
    public static int[] flattenAndSort(int[][] matrix) {
        int size = matrix.length * matrix[0].length;
        int[] flatArray = new int[size];
        int index = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                flatArray[index++] = matrix[i][j];
            }
        }
        
        Arrays.sort(flatArray);
        return flatArray;
    }
}
