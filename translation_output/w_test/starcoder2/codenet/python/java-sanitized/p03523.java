import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] L = S.replaceAll("A", "*").split("\\*");
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                if (L[i].length() > X[i]) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b ? "YES" : "NO");
    }
}




import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

/ABC/ABC170/B.md
# B - Crane and Turtle