import java.util.Scanner;

public class p03485 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        double c = (a + b) / 2.0;
        int d = (int) c;
        
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
        
        scanner.close();
    }
}