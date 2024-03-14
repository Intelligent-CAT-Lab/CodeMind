import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strs = input.split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }

        int e = nums[4];
        int f = nums[5];

        List<Integer> listx = new ArrayList<>();
        int a = nums[0];
        int b = nums[1];

        for (int i = 0; ; i++) {
            if (i * a * 100 > f) {
                break;
            }
            for (int j = 0; ; j++) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (!listx.contains(x)) {
                    listx.add(x);
                }
            }
        }

        List<Integer> listy = new ArrayList<>();
        int c = nums[2];
        int d = nums[3];

        double f2 = f * e / (100.0 + e);

        for (int i = 0; ; i++) {
            if (i * c > f2) {
                break;
            }
            for (int j = 0; ; j++) {
                int y = i * c + j * d;
                if (y > f2) {
                    break;
                }
                if (!listy.contains(y)) {
                    listy.add(y);
                }
            }
        }

        int lengthx = listx.size();
        int lengthy = listy.size();

        int xy_max = 0;
        int y_max = 0;
        double noudo_max = 0;

        for (int i = 0; i < lengthx; i++) {
            for (int j = 0; j < lengthy; j++) {
                int x = listx.get(i);
                int y = listy.get(j);
                if (x + y > f) {
                    continue;
                }
                if ((double) y * 100 / (double) x <= e) {
                    double noudo = (double) y / (x + y);
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