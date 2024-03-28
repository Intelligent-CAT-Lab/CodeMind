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
        int[] listx = new int[f / (a * 100)];
        for (int i = 0; i < listx.length; i++) {
            int j = 0;
            while (true) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (x == 0) {
                    j++;
                    continue;
                }
                if (x > 0 &&!contains(listx, x)) {
                    listx[listx.length - 1 - i] = x;
                }
                j++;
            }
        }

        // yãåãå¾ãå¤
        int c = arr[2];
        int d = arr[3];
        int[] listy = new int[f * e / (100 + e)];
        for (int i = 0; i < listy.length; i++) {
            int j = 0;
            while (true) {
                int y = i * c + j * d;
                if (y > f * e / (100 + e)) {
                    break;
                }
                if (y > 0 &&!contains(listy, y)) {
                    listy[listy.length - 1 - i] = y;
                }
                j++;
            }
        }

        // å
¨ã¦ã®xã¨yã®çµã¿åããã«ã¤ãã¦fãè¶
ããªãããããã³æº¶ãåããããèª¿ã¹ã
        int lengthx = listx.length;
        int lengthy = listy.length;
        int xy_max = 0;
        int y_max = 0;
        double noudo_max = 0;

        for (int i = 0; i < lengthx; i++) {
            for (int j = 0; j < lengthy; j++) {
                int x = listx[i];
                int y = listy[j];
                if (x + y > f) {
                    continue;
                }
                if ((double) y * 100 / (double) x <= e) {
                    double noudo = (double) y / (x + y);
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

    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}