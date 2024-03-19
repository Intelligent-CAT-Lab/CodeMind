import java.util.*;

public class p03601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = input.split(" ");
        int[] listx = new int[list.length];
        int[] listy = new int[list.length];
        int e = Integer.parseInt(list[4]);
        int f = Integer.parseInt(list[5]);
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);
        int d = Integer.parseInt(list[3]);
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
                if (!Arrays.asList(listx).contains(x)) {
                    listx[i] = x;
                }
                j++;
            }
            i++;
        }
        int f2 = f * e / (100.0 + e);
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
                if (!Arrays.asList(listy).contains(y)) {
                    listy[i] = y;
                }
                j++;
            }
            i++;
        }
        int xy_max = 0;
        int y_max = 0;
        int noudo_max = 0;
        for (int k = 0; k < listx.length; k++) {
            for (int l = 0; l < listy.length; l++) {
                int x = listx[k];
                int y = listy[l];
                if (x + y > f) {
                    continue;
                }
                if ((float) y / (x + y) <= e) {
                    double noudo = (float) y / (x + y);
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