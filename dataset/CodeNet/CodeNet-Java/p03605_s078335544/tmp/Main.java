import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
System.out.println("[INST]7;x;input.nextInt();"+x);
        String s = Integer.toString(x);
System.out.println("[INST]8;s;Integer.toString(x);"+s);
        if (x >= 10 && x <= 99) {
            if (s.contains("9")) {
System.out.println("[INST]10;None;s.contains('9');"+s.contains("9"));
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
