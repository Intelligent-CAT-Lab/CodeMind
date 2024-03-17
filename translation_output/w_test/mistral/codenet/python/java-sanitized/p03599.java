import java.util.*;

public class p03599 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        int maxSugar = 0;
        int maxWater = 100 * a[0];
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 31; j++) {
                for (int k = 0; k < 3001; k++) {
                    int water = 100 * a[0] * i + 100 * a[1] * j;
                    int sugar = a[2] * k;
                    if (water + sugar > a[5]) {
                        continue;
                    }
                    if (sugar > (a[0] * i + a[1] * j) * a[3]) {
                        continue;
                    }
                    sugar += Math.min((a[5] - (water + sugar)) / (a[4] * a[4]), ((a[0] * i + a[1] * j) * a[3] - a[2] * k) / (a[4] * a[4]));
                    if (100 * maxSugar * (water + sugar) < 100 * sugar * (maxSugar + maxWater)) {
                        maxSugar = sugar;
                        maxWater = water;
                    }
                }
            }
        }
        System.out.println(maxSugar + maxWater + " " + maxSugar);
    }
}