import java.util.Scanner;

public class p03250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] abc = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            abc[i] = Integer.parseInt(input[i]);
        }
        abc = sort(abc);
        int result = Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0];
        System.out.println(result);
    }

    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}