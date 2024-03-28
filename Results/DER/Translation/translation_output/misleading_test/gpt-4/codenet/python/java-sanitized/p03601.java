import java.util.ArrayList;
import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int[] list = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            list[i] = Integer.parseInt(parts[i]);
        }

        int e = list[4];
        int f = list[5];

        ArrayList<Integer> listx = new ArrayList<>();
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
                if (x != 0 && !listx.contains(x)) {
                    listx.add(x);
                }
                j++;
            }
            i++;
        }

        ArrayList<Integer> listy = new ArrayList<>();
        int c = list[2];
        int d = list[3];
        double f2 = (double) f * e / (100.0 + e);

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
                if (!listy.contains(y)) {
                    listy.add(y);
                }
                j++;
            }
            i++;
        }

        int xy_max = 0;
        int y_max = 0;
        double noudo_max = 0;

        for (int xVal : listx) {
            for (int yVal : listy) {
                if (xVal + yVal > f) {
                    continue;
                }
                if ((double) yVal * 100 / (double) xVal <= e) {
                    double noudo = (double) yVal / (xVal + yVal);
                    if (noudo >= noudo_max) {
                        xy_max = xVal + yVal;
                        y_max = yVal;
                        noudo_max = noudo;
                    }
                }
            }
        }

        System.out.println(xy_max + " " + y_max);
        sc.close();
    }
}