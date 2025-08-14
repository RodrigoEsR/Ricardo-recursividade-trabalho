import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr = fillArray(arr,sc, n);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        showArray(arr,sc,n);
        sc.close();


    }

    public static int[] fillArray(int[] arr, Scanner sc,int n) {
        if(n <= 0){
            return arr;
        }
        System.out.println("Insert the element: ");
        int element = sc.nextInt();
        arr[n-1] = element;
        return fillArray(arr,sc,n-1);

    }

    public static void showArray(int[] arr,Scanner sc,int n) {
        if(arr.length >= 0){
            return;
        }
        System.out.println(arr[n-1]);
        showArray(arr,sc,n-1);
    }
}