import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr = fillArray(arr,sc, n);
        showArray(arr,sc,n-1);
        sc.close();


    }

    public static int[] fillArray(int[] arr, Scanner sc,int n) {
        if(n <= 0){
            return arr;
        }
        System.out.println("Insert the element: ");
        arr[n-1] = sc.nextInt();
        return fillArray(arr,sc,n-1);

    }

    public static int showArray(int[] arr,Scanner sc,int n) {
        if(n >= 1){
            return arr[0];
        }
        System.out.println(arr[n]);
        return showArray(arr,sc,n-1);
    }
}