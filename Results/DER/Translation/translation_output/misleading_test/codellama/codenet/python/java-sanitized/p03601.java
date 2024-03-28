import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] list = input.split(" ");
        int[] intList = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            intList[i] = Integer.parseInt(list[i]);
        }

        int e = intList[4];
        int f = intList[5];

        // xãåãå¾ãå¤
        int[] listx = new int[intList.length];
        int a = intList[0];
        int b = intList[1];

        int i = 0;
        while (true) {
            if (i * a * 100 > f) {
                break;
            }
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
                if (!listx.contains(x)) {
                    listx.add(x);
                }
                j++;
            }
            i++;
        }

        // yãåãå¾ãå¤
        int[] listy = new int[intList.length];
        int c = intList[2];
        int d = intList[3];

        // yãæ°´ã«æº¶ãåããæå¤§å¤
        int f2 = f * e / (100.0 + e);

        int i = 0;
        while (true) {
            if (i * c > f2) {
                break;
            }
            int j = 0;
            while (true) {
                int y = i * c + j * d;
                if (y > f2) {
                    break;
                }
                if (!listy.contains(y)) {
                    listy.add(y);
                }
                j++;
            }
            i++;
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
                if (y * 100.0 / x <= e) {
                    double noudo = y / (x + y);
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