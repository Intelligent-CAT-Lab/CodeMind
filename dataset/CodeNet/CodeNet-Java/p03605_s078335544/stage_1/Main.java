import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        String s = Integer.toString(x);
        if (x >= 10 && x <= 99) {
var newVariable_0 = s.contains("9");            if (newVariable_0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
