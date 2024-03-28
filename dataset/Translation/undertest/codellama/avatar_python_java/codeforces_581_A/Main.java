import java.util.Scanner;

public class codeforces_581_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int min = Math.min(a, b);
        int diff = Math.abs(a - b);
        if (diff >= 2) {
            System.out.println(min + " â " + diff / 2);
        } else {
            System.out.println(min + " â 0");
        }
    }
}