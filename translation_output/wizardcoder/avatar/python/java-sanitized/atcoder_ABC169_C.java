import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        String b = arr[1];
        b = b.substring(0, 1) + b.substring(2);
        int a = Integer.parseInt(arr[0]);
        int b1 = Integer.parseInt(b);
        int result = a * b1 / 100;
        System.out.println(result);
    }
}