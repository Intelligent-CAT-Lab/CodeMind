import java.util.Scanner;

public class p01829 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(findClosestPalindrome(inputString));
        scanner.close();
    }

    public static String findClosestPalindrome(String s) {
        int n = Integer.parseInt(s);
        int l = s.length();
        int m = Integer.MAX_VALUE;
        String r = "";
        int t = (int) Math.pow(10, l);

        int[] numbers = new int[l];
        for (int i = 0; i < l; i++) {
            numbers[i] = i;
        }

        do {
            int b = 0;
            for (int c : numbers) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                StringBuilder sb = new StringBuilder();
                for (int c : numbers) {
                    sb.append(c);
                }
                r = sb.toString();
            }
        } while (nextPermutation(numbers));

        return r;
    }

    private static boolean nextPermutation(int[] array) {
        // Find the largest index k such that a[k] < a[k + 1]
        int k = array.length - 2;
        while (k >= 0 && array[k] >= array[k + 1]) {
            k--;
        }
        if (k < 0) {
            return false;
        }

        // Find the largest index l greater than k such that a[k] < a[l]
        int l = array.length - 1;
        while (array[k] >= array[l]) {
            l--;
        }

        // Swap the value of a[k] with that of a[l]
        swap(array, k, l);

        // Reverse the sequence from a[k + 1] up to and including the final element a[n]
        int start = k + 1;
        int end = array.length - 1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }

        return true;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}