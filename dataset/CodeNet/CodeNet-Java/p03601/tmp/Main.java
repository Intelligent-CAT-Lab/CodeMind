import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int a = sc.nextInt();
System.out.println("[INST]12;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]13;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]14;c;sc.nextInt();"+c);
        int d = sc.nextInt();
System.out.println("[INST]15;d;sc.nextInt();"+d);
        int e = sc.nextInt();
System.out.println("[INST]16;e;sc.nextInt();"+e);
        int f = sc.nextInt();
System.out.println("[INST]17;f;sc.nextInt();"+f);

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
