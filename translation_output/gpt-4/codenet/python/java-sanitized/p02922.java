import java.util.Scanner;

public class p02922 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        
        int total = 1;
        int ans = 0;
        
        while (total < b) {
            ans += 1;
            total += a - 1;
        }
        
        System.out.println(ans);
        scanner.close();
    }
}