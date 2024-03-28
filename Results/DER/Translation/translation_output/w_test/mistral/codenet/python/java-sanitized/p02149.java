import java.util.*;

public class p02149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        if (S[0] == S[1] && S[1] == S[2]) {
            System.out.println("A");
        } else if (S[0] == S[1] || S[1] == S[2] || S[0] == S[2]) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}

Sample test case:

1000 900 850

Expected output:

A