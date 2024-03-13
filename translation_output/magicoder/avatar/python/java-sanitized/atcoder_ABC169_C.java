import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String b = input[0].charAt(0) + input[0].substring(2);
        int a = Integer.parseInt(input[1]);
        int result = (Integer.parseInt(b) * a) / 100;
        System.out.println(result);
    }
}