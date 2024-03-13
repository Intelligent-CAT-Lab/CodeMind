import java.util.Scanner;

public class p03090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        if (N % 2 == 0) {
            int[][] edge = new int[N * (N - 1) / 2][2];
            int index = 0;
            for (int s = 1; s <= N; s++) {
                int ng = N - s + 1;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge[index][0] = s;
                    edge[index][1] = t;
                    index++;
                }
            }
            System.out.println(index);
            for (int i = 0; i < index; i++) {
                System.out.println(edge[i][0] + " " + edge[i][1]);
            }
        } else {
            int[][] edge = new int[N * (N - 1) / 2][2];
            int index = 0;
            for (int s = 1; s <= N; s++) {
                int ng = N - s;
                for (int t = 1; t <= N; t++) {
                    if (s >= t || t == ng) {
                        continue;
                    }
                    edge[index][0] = s;
                    edge[index][1] = t;
                    index++;
                }
            }
            System.out.println(index);
            for (int i = 0; i < index; i++) {
                System.out.println(edge[i][0] + " " + edge[i][1]);
            }
        }
    }
}