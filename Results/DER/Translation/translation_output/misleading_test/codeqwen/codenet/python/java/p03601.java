Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] list = input.split(" ");
        int e = Integer.parseInt(list[4]);
        int f = Integer.parseInt(list[5]);

        // 1 2 10 20 15 200
        // 17 19 22 26 55 2802

        // xaåãå¾ãå¤
        int[] listx = new int[1000];
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

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
                if (x != 0) {
                    listx[x] = x;
                }
                j++;
            }
            i++;
        }

        // yãåãå¾ãå¤
        int[] listy = new int[1000];
        int c = Integer.parseInt(list[2]);
        int d = Integer.parseInt(list[3]);

        // yãæ°´ã«æº¶ãåããæå¤§å¤
        double f2 = f * e / (100.0 + e);

        i = 0;
        while (true) {
            if (i * c > f2) {
                break;
            }
            int j
