import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int e = numbers[4];
        int f = numbers[5];

        List<Integer> listX = new ArrayList<>();
        int a = numbers[0];
        int b = numbers[1];
        for (int i = 0; ; i++) {
            if (i * a * 100 > f) {
                break;
            }
            for (int j = 0; ; j++) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (!listX.contains(x)) {
                    listX.add(x);
                }
            }
        }

        List<Integer> listY = new ArrayList<>();
        int c = numbers[2];
        int d = numbers[3];
        for (int i = 0; ; i++) {
            if (i * c > f) {
                break;
            }
            for (int j = 0; ; j++) {
                int y = i * c + j * d;
                if (y > f) {
                    break;
                }
                if (!listY.contains(y)) {
                    listY.add(y);
                }
            }
        }

        int xyMax = 0;
        int yMax = 0;
        double noudoMax = 0;
        for (int x : listX) {
            for (int y : listY) {
                if (x + y > f) {
                    continue;
                }
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

        System.out.println(xyMax + " " + yMax);
    }
}