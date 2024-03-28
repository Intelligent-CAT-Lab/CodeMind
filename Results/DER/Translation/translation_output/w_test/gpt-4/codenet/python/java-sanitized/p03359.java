import java.util.Scanner;

public class p03359 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        if(a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }

        input.close();
    }
}