```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArr = input.split(" ");
        int[] list = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            list[i] = Integer.parseInt(strArr[i]);
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

        ArrayList<Integer> listy = new ArrayList<>();
        int c = list[2];
        int d = list[3];

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

        int xy_max = 0;
        int y_max = 0;
        double noudo_max = 0;

        for (int x : listx) {
            for (int y : listy) {
                if (x + y > f) {
                    continue;
                }
                if ((double)y * 100 / (double)(x + y) <= e) {
                    double noudo = (double)y / (double)(x + y);
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
```
