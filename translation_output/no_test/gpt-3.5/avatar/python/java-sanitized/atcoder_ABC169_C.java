import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1].charAt(0) + input[1].substring(2);
        
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        
        System.out.println(num1 * num2 / 100);
    }
}