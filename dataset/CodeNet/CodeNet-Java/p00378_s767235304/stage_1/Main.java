import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int n;
        int O;
        int T;
        int G;
        int z;
        int y;

        T = X / 500;
        n = X / 1000;
        if (X % 1000 == 0) {
            O = A * n;
        } else {
            O = A * (n + 1);
        }
        if (X % 500 == 0) {
            G = B * T;

        } else {
            G = B * (T + 1);
        }
        int mini = 99999999;
        int nedan;

        for (int i = 0; i < 1000; i++) {
            if (X >= i * 1000) {
                z = X - (i * 1000);

                y = z / 500;
                if (z % 500 == 0) {
                    nedan = i * A + y * B;

                } else {
                    nedan = i * A + (y + 1) * B;
                }
                if (mini >= nedan) {
                    mini = nedan;
                }
            }
        }

        if (O < G && O < mini) {

            System.out.println(O);

        } else if (G < O && G < mini) {

            System.out.println(G);

        } else if (mini <= O && mini <= G) {
            System.out.println(mini);
        }
    }

}

