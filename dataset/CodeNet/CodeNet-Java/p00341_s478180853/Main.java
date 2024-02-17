

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int e[] = new int[13];
        int i;
        int p = 0;
        int k;
        for (i = 0; i < 12; i++) {
            e[i] = scan.nextInt();
        }
        for (i = 0; i < 12; i++) {
            for (int j = 0; j < 12 - i; j++) {
                if (e[j] < e[j + 1]) {
                    int y = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = y;

                }
            }
        }
        for (int u = 0; u < 3; u++) {
            for (k = 0; k < 4; k++) {
                i = u * 4;
                if (e[i] == e[i + 1] && e[i + 2] == e[i + 3] && e[i] == e[i + 2] && e[i + 1] == e[i + 3] && e[i] == e[i + 3] && e[i + 1] == e[i + 2]) {
                    p += 1;
                } else {
                    p += 0;
                }

            }

        }
        if (p == 12) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

