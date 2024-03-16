import java.util.Scanner;

public class p03485 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        double c = (a + b) / 2.0;
        int d = (int)c;
        
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
        
        input.close();
    }
}