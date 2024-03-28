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

        int[] listx = new int[intList[0]];
        int[] listy = new int[intList[2]];

        for (int i = 0; i < intList[0]; i++) {
            listx[i] = i * intList[0] * 100;
        }

        for (int i = 0; i < intList[2]; i++) {
            listy[i] = i * intList[2] + intList[3];
        }

        int xy_max = 0;
        int y_max = 0;
        double noudo_max = 0;

        for (int i = 0; i < listx.length; i++) {
            for (int j = 0; j < listy.length; j++) {
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