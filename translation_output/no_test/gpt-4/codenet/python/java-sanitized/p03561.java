import java.util.Scanner;

public class p03561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read inputs
        int K = sc.nextInt();
        int N = sc.nextInt();
        
        // Execute logic based on the condition of K being even or odd
        if (K % 2 == 0) {
            // If K is even, print the desired sequence
            System.out.print((K / 2) + " ");
            for (int i = 1; i < N; i++) {
                System.out.print(K + " ");
            }
            System.out.println();
        } else {
            // If K is odd, construct and print the sequence as specified
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = (K + 1) / 2;
            }
            
            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    N--; // Decrease the size of the array by 1 (simulate pop)
                } else {
                    X[N - 1]--;
                    for (int j = N; j < X.length; j++) {
                        X[j] = K;
                    }
                    N = X.length; // Return to original size after extension
                }
            }
            
            // Print the array
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}