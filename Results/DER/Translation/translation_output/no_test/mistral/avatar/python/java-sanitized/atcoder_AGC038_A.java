import java.util.Scanner;
public class atcoder_AGC038_A {
    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    if (j < A) {
                        answer[i][j] = "0";
                    } else {
                        answer[i][j] = "1";
                    }
                } else {
                    if (j < A) {
                        answer[i][j] = "1";
                    } else {
                        answer[i][j] = "0";
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(String.join(" ", answer[i]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] tokens = line.split(" ");
            int H = Integer.parseInt(tokens[0]);
            int W = Integer.parseInt(tokens[1]);
            int A = Integer.parseInt(tokens[2]);
            int B = Integer.parseInt(tokens[3]);
            solve(H, W, A, B);
        }
    }
}