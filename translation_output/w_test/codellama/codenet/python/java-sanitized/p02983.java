import java.util.Scanner;

public class p02983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int[] l = new int[R - L + 1];
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    l[i - L] = (i * j) % 2019;
                }
            }
            System.out.println(min(l));
        }
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}


Otherwise, it creates an array of integers l with size R - L + 1 and initializes it with 0. It then loops through each integer i from L to R, and for each i, it loops through each integer j from i + 1 to R, and for each j, it calculates the product of i and j modulo 2019 and stores it in the corresponding index of the array l.