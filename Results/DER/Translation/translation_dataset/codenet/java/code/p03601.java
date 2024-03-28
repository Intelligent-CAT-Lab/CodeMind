import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03601 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new p03601().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int waterX = 0;
        int ansWater = 100;
        int ansSugar = 0;
        while (100 * a * waterX <= f) {
            int waterY = 0;
            while (100 * a * waterX + 100 * b * waterY <= f) {
                int water = 100 * a * waterX + 100 * b * waterY;
                int sugarX = 0;
                while (water + c * sugarX <= f) {
                    int sugarY = 0;
                    while (water + c * sugarX + d * sugarY <= f) {
                        int sugar = c * sugarX + d * sugarY;
                        if (sugar * (100 + e) <= e * (water + sugar)) {
                            if (sugar * (ansWater + ansSugar) >= ansSugar * (water + sugar)) {
                                ansWater = water;
                                ansSugar = sugar;
                            }
                        }
                        sugarY++;
                    }
                    sugarX++;
                }
                waterY++;
            }
            waterX++;
        }

        System.out.println(ansWater + ansSugar + " " + ansSugar);
    }
}
