import java.util.Scanner;

public class p02724 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = scanner.nextInt();
        int num_500 = total / 500;
        
        int remain = total - num_500 * 500;
        int num_5 = remain / 5;
        
        System.out.println(num_500 * 1000 + num_5 * 5);
    }
}