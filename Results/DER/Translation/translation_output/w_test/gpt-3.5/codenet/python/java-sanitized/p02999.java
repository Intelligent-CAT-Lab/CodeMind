import java.util.Scanner;

public class p02999 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println(a < b ? 0 : 10);
    }
}