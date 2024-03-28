import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] edge = new int[N][2];
        int count = 0;
        for (int s = 1; s <= N; s++) {
            int ng = N - s + 1;
            for (int t = 1; t <= N; t++) {
                if (s >= t || t == ng) {
                    continue;
                }
                edge[count][0] = s;
                edge[count][1] = t;
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(edge[i][0] + " " + edge[i][1]);
        }
    }
}