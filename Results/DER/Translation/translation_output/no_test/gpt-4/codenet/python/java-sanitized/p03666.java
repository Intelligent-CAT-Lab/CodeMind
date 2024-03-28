import java.util.Scanner;

public class p03666 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = inpl(sc);
        
        int N = input[0];
        int A = input[1];
        int B = input[2];
        int C = input[3];
        int D = input[4];
        boolean found = false;
        
        for (int k = 0; k <= N; k++) {
            int j = N - 1 - k;
            if (D*k - C*j >= B-A && B-A >= C*k - D*j) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("NO");
        }
    }
    
    private static int[] inpl(Scanner sc) {
        String[] parts = sc.nextLine().split(" ");
        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
}