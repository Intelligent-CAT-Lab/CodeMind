import java.util.Scanner;

public class JavaApplication38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int counter = 0;
        
        while (num1 != 0 && num2 != 0) {
            if (num1 == 1 && num2 == 1) {
                break;
            }
            
            if (num1 <= num2) {
                num1++;
                num2 -= 2;
            } else {
                num1 -= 2;
                num2++;
            }
            
            counter++;
        }
        
        System.out.println(counter);
    }
}