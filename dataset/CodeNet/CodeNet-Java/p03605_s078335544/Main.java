import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        String s = Integer.toString(x);
        if (x >= 10 && x <= 99) {
            if (s.contains("9")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
