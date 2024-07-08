import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int X = sc.nextInt();
                        long ans = 2;
                        for (int i = X; i > 0; i--) {
                                ans = ans * 2 + 2;
                        }
                        System.out.println(ans);
                }
        }
}