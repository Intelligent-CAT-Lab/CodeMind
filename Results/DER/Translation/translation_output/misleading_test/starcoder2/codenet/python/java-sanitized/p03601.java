import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = input.split(" ");
        int[] listInt = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            listInt[i] = Integer.parseInt(list[i]);
        }
        int e = listInt[4];
        int f = listInt[5];
        int a = listInt[0];
        int b = listInt[1];
        int c = listInt[2];
        int d = listInt[3];
        int[] listx = new int[10000];
        int[] listy = new int[10000];
        int lengthx = 0;
        int lengthy = 0;
        for (int i = 0; i < 10000; i++) {
            int x = i * a * 100;
            if (x > f) {
                break;
            }
            for (int j = 0; j < 10000; j++) {
                int y = j * b * 100;
                if (x + y > f) {
                    break;
                }
                if (x + y == 0) {
                    continue;
                }
                listx[lengthx] = x + y;
                lengthx++;
            }
        }
        double f2 = f * e / (100.0 + e);
        for (int i = 0; i < 10000; i++) {
            int x = i * c;
            if (x > f2) {
                break;
            }
            for (int j = 0; j < 10000; j++) {
                int y = j * d;
                if (x + y > f2) {
                    break;
                }
                listy[lengthy] = y;
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
        System.out.println(xy_max + " " + y_max);
    }
}