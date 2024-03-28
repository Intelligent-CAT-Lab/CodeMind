import java.util.Scanner;

public class p02141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        double result = calculate(arr);
        System.out.println(result);
    }

    public static double calculate(int[] arr) {
        int W = arr[0];
        int H = arr[1];
        int w = arr[2];
        int h = arr[3];
        int x = arr[4];
        int y = arr[5];

        int a = Math.min(W/2, x + w/2) + Math.max(-W/2, x-w/2);
        int b = Math.min(H/2, y + h/2) + Math.max(-H/2, y-h/2);
        return (double) b/a;
    }
}