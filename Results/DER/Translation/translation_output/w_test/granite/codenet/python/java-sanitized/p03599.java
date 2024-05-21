import java.util.*;

public class p03599 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int maxSugar = 0;
        int maxWater = 100 * a;
        for (int i = 0; i <= 30; i++) {
            for (int j = 0; j <= 30; j++) {
                for (int k = 0; k <= 3000; k++) {
                    int water = 100 * a * i + 100 * b * j;
                    int sugar = c * k;
                    if (water + sugar > f) {
                        continue;
                    }
                    if (sugar > (a * i + b * j) * e) {
                        continue;
                    }
                    sugar += Math.min((f - (water + sugar)) / d * d, ((a * i + b * j) * e - c * k) / d * d);
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