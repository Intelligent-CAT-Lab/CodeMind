import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC178_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] inputs = scanner.nextLine().split("\\s+");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int d = Integer.parseInt(inputs[3]);
        
        int ans = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        
        System.out.println(ans);

        scanner.close();
    }
}