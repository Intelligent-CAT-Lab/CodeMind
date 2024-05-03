import java.util.Scanner;

public class p03416 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int f = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);
        int count = 0;
        for (int i = f; i <= t; i++) {
            String str = Integer.toString(i);
            String reversedStr = new StringBuilder(str).reverse().toString();
            if (str.equals(reversedStr)) {
                count++;
            }
        }
        System.out.println(count);
    }
}