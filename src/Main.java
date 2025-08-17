import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements
        System.out.println("Insert the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr = fillArray(arr,sc, n);
        showArray(arr,n-1);
        sc.close();

    }

    // Insert elements in the array using recursion
    public static int[] fillArray(int[] arr, Scanner sc,int n) {
        if(n <= 0){
            return arr;
        }
        System.out.printf("Insert the element: (Remaining: %d) ", n);
        arr[n-1] = sc.nextInt();
        return fillArray(arr,sc,n-1);

    }

    // Show elements of the array using recursion
    public static int showArray(int[] arr, int array) {
        if(array < 0){ // Stop when hit 0
            return 0;
        }
        System.out.println(arr[array]);
        return showArray(arr,array-1);
    }
}