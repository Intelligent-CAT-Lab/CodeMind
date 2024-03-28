import java.util.Scanner;

public class p03648 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        
        int a = K / 50;
        int b = K % 50;
        int[] ans = new int[50];
        
        for (int i = 0; i < 50 - b; i++) {
            ans[i] = a + i;
        }
        
        for (int i = 50 - b; i < 50; i++) {
            ans[i] = a + 50 - b + i + 1;
        }
        
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}