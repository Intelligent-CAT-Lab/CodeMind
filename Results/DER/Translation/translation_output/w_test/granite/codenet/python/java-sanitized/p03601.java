import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] list = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            list[i] = Integer.parseInt(input[i]);
        }

        int e = list[4];
        int f = list[5];

        int[] listx = new int[10000];
        int a = list[0];
        int b = list[1];
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
                if (!contains(listx, x)) {
                    listx[i] = x;
                }
                j++;
            }
            i++;
        }

        int[] listy = new int[10000];
        int c = list[2];
        int d = list[3];

        int f2 = (int) (f * e / (100.0 + e));

        i = 0;
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
                if (!contains(listy, y)) {
                    listy[i] = y;
                }
                j++;
            }
            i++;
        }

        int lengthx = 0;
        for (int x : listx) {
            if (x!= 0) {
                lengthx++;
            }
        }
        int lengthy = 0;
        for (int y : listy) {
            if (y!= 0) {
                lengthy++;
            }
        }

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
                if ((double) y * 100 / x <= e) {
                    double noudo = (double) y / (x + y);
                    if (noudo >= noudo_max) {
                        xy_max = x + y;
                        y_max = y;
                        noudo_max = noudo;
                    }
                }
            }
        }

        System.out.println(xy_max + " " + y_max);
    }

    private static boolean contains(int[] list, int x) {
        for (int i : list) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }
}