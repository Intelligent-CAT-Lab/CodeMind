import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = input.split(" ");
        int[] arr = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            arr[i] = Integer.parseInt(list[i]);
        }

        int e = arr[4];
        int f = arr[5];

        // 1 2 10 20 15 200
        // 17 19 22 26 55 2802

        // xãåãå¾ãå¤
        int a = arr[0];
        int b = arr[1];
        int i = 0;
        int j = 0;
        int x = 0;
        int y = 0;
        int[] listx = new int[10000];
        int[] listy = new int[10000];
        while (true) {
            if (i * a * 100 > f) {
                break;
            }
            j = 0;
            while (true) {
                x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (x == 0) {
                    j++;
                    continue;
                }
                if (x > 0 && x < 10000 && listx[x] == 0) {
                    listx[x] = 1;
                }
                j++;
            }
            i++;
        }

        // yãåãå¾ãå¤
        int c = arr[2];
        int d = arr[3];
        i = 0;
        j = 0;
        x = 0;
        y = 0;
        int f2 = (int) (f * e / (100.0 + e));
        while (true) {
            if (i * c > f2) {
                break;
            }
            j = 0;
            while (true) {
                y = i * c + j * d;
                if (y > f2) {
                    break;
                }
                if (y > 0 && y < 10000 && listy[y] == 0) {
                    listy[y] = 1;
                }
                j++;
            }
            i++;
        }

        // å
¨ã¦ã®xã¨yã®çµã¿åããã«ã¤ãã¦fãè¶
ããªãããããã³æº¶ãåããããèª¿ã¹ã
        int lengthx = 0;
        int lengthy = 0;
        int xy_max = 0;
        int y_max = 0;
        double noudo_max = 0;
        for (i = 0; i < 10000; i++) {
            if (listx[i] == 1) {
                lengthx++;
            }
            if (listy[i] == 1) {
                lengthy++;
            }
        }
        for (i = 0; i < lengthx; i++) {
            for (j = 0; j < lengthy; j++) {
                x = i * a * 100 + j * b * 100;
                y = i * c + j * d;
                if (x + y > f) {
                    continue;
                }
                if (y * 100 / (x + y) <= e) {
                    noudo = (double) y / (x + y);
                    if (noudo >= noudo_max) {
                        xy_max = x + y;
                        y_max = y;
                        noudo_max = noudo;
                    }
                }
            }
        }

        String message = xy_max + " " + y_max;
        System.out.println(message);
    }
}