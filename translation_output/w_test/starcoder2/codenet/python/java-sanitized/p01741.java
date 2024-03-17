import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(n / 1 + 1 > n * Math.sqrt(2) ? n * Math.sqrt(2) : n / 1 + 1);
    }
}




import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

/01-01-max-of-array.md
# Max of array

Write a program to find the maximum element in an array.