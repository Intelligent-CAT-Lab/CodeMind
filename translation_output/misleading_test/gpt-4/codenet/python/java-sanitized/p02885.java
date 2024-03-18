import java.util.Scanner;

public class p02885 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int A = input.nextInt();
        int B = input.nextInt();
        
        int diff = A - B * 2;
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
        
        input.close();
    }
}