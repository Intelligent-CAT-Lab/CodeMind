import java.util.ArrayList;
import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] list = input.split(" ");
        ArrayList<Integer> listx = new ArrayList<>();
        ArrayList<Integer> listy = new ArrayList<>();

        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        int c = Integer.parseInt(list[2]);
        int d = Integer.parseInt(list[3]);
        int e = Integer.parseInt(list[4]);
        int f = Integer.parseInt(list[5]);

        for (int i = 0; i * a * 100 <= f; i++) {
            for (int j = 0; i * a * 100 + j * b * 100 <= f; j++) {
                int x = i * a * 100 + j * b * 100;
                if (x != 0 && !listx.contains(x)) {
                    listx.add(x);
                }
            }
        }

        double f2 = f * e / (100.0 + e);
        for (int i = 0; i * c <= f2; i++) {
            for (int j = 0; i * c + j * d <= f2; j++) {
                int y = i * c + j * d;
                if (!listy.contains(y)) {
                    listy.add(y);
                }
            }
        }

        int xyMax = 0;
        int yMax = 0;
        double noudoMax = 0;

        for (int x : listx) {
            for (int y : listy) {
                if (x + y > f) {
                    continue;
                }
                double noudo = (double) y / (x + y);
                if (noudo >= noudoMax) {
                    xyMax = x + y;
                    yMax = y;
                    noudoMax = noudo;
                }
            }
        }

        System.out.println(xyMax + " " + yMax);
    }
}