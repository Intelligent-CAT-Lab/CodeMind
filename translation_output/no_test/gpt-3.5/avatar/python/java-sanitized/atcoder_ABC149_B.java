import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String number = scanner.nextLine();
        String[] tokens = number.split(" â ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);
        int k = Integer.parseInt(tokens[2]);
        
        int res = a - k;
        if (res < 0) {
            a = 0;
            b += res;
            b = (b < 0) ? 0 : b;
        } else {
            a = res;
        }

        System.out.println(a + " " + b);
    }
}