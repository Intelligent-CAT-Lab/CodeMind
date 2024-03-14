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
        int f1 = f / 100;
        int f2 = f % 100;
        int[] listx = new int[f1];
        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < 100; j++) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (x == 0) {
                    continue;
                }
                boolean isExist = false;
                for (int k = 0; k < listx.length; k++) {
                    if (x == listx[k]) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    listx[listx.length - 1] = x;
                    listx = Arrays.copyOf(listx, listx.length + 1);
                }
            }
        }

        // yãåãå¾ãå¤
        int c = arr[2];
        int d = arr[3];
        int f3 = f2 * e / (100 + e);
        int[] listy = new int[f3];
        for (int i = 0; i < f3; i++) {
            for (int j = 0; j < 100; j++) {
                int y = i * c + j * d;
                if (y > f3) {
                    break;
                }
                if (y == 0) {
                    continue;
                }
                boolean isExist = false;
                for (int k = 0; k < listy.length; k++) {
                    if (y == listy[k]) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    listy[listy.length - 1] = y;
                    listy = Arrays.copyOf(listy, listy.length + 1);
                }
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
                double noudo = (double) y / (x + y);
                if (noudo >= noudo_max) {
                    xy_max = x + y;
                    y_max = y;
                    noudo_max = noudo;
                }
            }
        }

        String message = xy_max + " " + y_max;
        System.out.println(message);
    }
}