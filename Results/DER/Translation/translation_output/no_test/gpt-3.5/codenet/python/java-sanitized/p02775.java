import java.util.Scanner;

public class p02775 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int n = Integer.parseInt(new StringBuilder(input).reverse().toString());
        int[] arr = new int[Integer.toString(n).length()];

        int index = 0;
        while (n > 0) {
            arr[index] = n % 10;
            n /= 10;
            index++;
        }
        arr[index] = 0;

        int s = 0;
        int res = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int ni = arr[i];
            int k = ni + s;
            if (k < 5 || (k == 5 && arr[i + 1] < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;

        System.out.println(res);
    }
}