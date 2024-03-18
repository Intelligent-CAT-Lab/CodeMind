import java.util.Scanner;

public class p03505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            int jumps = 1 - (int)Math.ceil((double)(K - A) / (A - B)) * 2;
            System.out.println(jumps);
        }

        scanner.close();
    }
    
    public static void main(String args[]) {
        Main main = new Main();
        main.main();
    }
}