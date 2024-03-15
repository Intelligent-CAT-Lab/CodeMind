import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        String aString = inputs[0];
        String bString = inputs[1].substring(0, 1) + inputs[1].substring(2);
        int a = Integer.parseInt(aString);
        int b = Integer.parseInt(bString);
        System.out.println((a * b) / 100);
        scanner.close();
    }
}