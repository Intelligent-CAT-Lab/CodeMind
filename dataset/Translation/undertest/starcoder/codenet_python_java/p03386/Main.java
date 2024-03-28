import java.util.*;
public class p03386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int[] X = new int[K];
        int[] Y = new int[K];
        for(int i=0;i<K;i++){
            X[i] = A+i;
            Y[i] = B-i;
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        for(int i=0;i<K;i++){
            System.out.println(X[i]);
            System.out.println(Y[i]);
        }
    }
}