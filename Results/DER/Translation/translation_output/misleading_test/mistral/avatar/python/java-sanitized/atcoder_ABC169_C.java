import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String b = split[0] + split[2];
        int a = Integer.parseInt(split[1]);
        int bInt = Integer.parseInt(b);
        int result = a * bInt / 100;
        System.out.println(result);
    }
}