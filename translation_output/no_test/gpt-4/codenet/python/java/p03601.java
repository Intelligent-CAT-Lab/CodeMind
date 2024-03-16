Here is the equivalent Java code for the provided Python script:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        int e = list.get(4);
        int f = list.get(5);

        List<Integer> listX = new ArrayList<>();
        int a = list.get(0);
        int b = list.get(1);

        int i = 0;
        while (true) {
            if (i * a * 100 > f) break;
            int j = 0;
            while (true) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) break;
                if (x == 0) {
                    j++;
                    continue;
                }
                if (!listX.contains(x)) {
                    listX.add(x);
                }
                j++;
            }
            i++;
        }

        List<Integer> listY = new ArrayList<>();
        int c = list.get(2);
        int d = list.get(3);

        double f2 = f * e / (100.0 + e);

        i = 0;
        while (true) {
            if (i * c > f2) break;
            int j = 0;
            while (true) {
                int y = i * c + j * d;
                if (y > f2) break;
                if (!listY.contains(y)) {
                    listY.add(y);
                }
                j++;
            }
            i++;
        }

        int lengthX = listX.size();
        int lengthY = listY.size();

        int xyMax = 0;
        int yMax = 0;
        double noudoMax = 0.0;

        for (i = 0; i < lengthX; i++) {
            for (int j = 0; j < lengthY; j++) {
                int x = listX.get(i);
                int y = listY.get(j);
                if (x + y > f) continue;
                if ((double) y * 100 / (double) x <= e) {
                    double noudo = (double) y / (x + y);
                    if (noudo >= noudoMax) {
                        xyMax = x + y;
                        yMax = y;
                        noudoMax = noudo;
                    }
                }
            }
        }

        String message = xyMax + " " + yMax;
        System.out.println(message);

        scanner.close();
    }
}
```

Please keep in mind that Java is strongly typed and has explicit type declaration for all variables, which differs significantly from Python's dynamic typing. This Java code uses a `Scanner` for input reading and `ArrayList` for dynamic array lists, which are the closest standard equivalents to Python lists. Also, I've renamed the variable `input` to avoid clashes with Java's `System.in` input stream.
