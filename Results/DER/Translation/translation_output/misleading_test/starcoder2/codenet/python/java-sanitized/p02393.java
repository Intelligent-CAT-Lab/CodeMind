import java.util.Scanner;

public class p02393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        int[] arr1 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr