import java.util.ArrayList;
import java.util.List;
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

        List<Integer> listx = new ArrayList<>();
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

        List<Integer> listy = new ArrayList<>();
        int c = intList[2];
        int d = intList[3];

        double f2 = f * e / (100.0 + e);

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

        int lengthx = listx.size();
        int lengthy = listy.size();

        int xyMax = 0;
        int yMax = 0;
        double noudoMax = 0;

        for (int j = 0; j < lengthx; j++) {
            for (int k = 0; k < lengthy; k++) {
                int x = listx.get(j);
                int y = listy.get(k);
                if (x + y > f) {
                    continue;
                }
                if ((double) y * 100 / (x + y) <= e) {
                    double noudo = (double) y / (x + y);
                    if (noudo >= noudoMax) {
                        xyMax = x + y;
                        yMax = y;
                        noudoMax = noudo;
                    }
                }
            }
        }

        System.out.println(xyMax + " " + yMax);
    }
}