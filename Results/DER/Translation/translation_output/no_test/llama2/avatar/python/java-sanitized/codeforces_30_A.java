import java.util.Scanner;

public class codeforces_30_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] M = new int[3];
        M[0] = Integer.parseInt(sc.nextLine());
        M[1] = Integer.parseInt(sc.nextLine());
        M[2] = Integer.parseInt(sc.nextLine());
        if (M[0] != 0) {
            if (M[1] % M[0] != 0) {
                System.out.println("No solution");
            } else {
                M[1] = M[1] / M[0];
                int x = 0, y = -2000;
                if (M[1] >= 0) {
                    while (y < M[1]) {
                        y = Math.pow(x, M[2]);
                        x = x + 1;
                    }
                    if (y > M[1]) {
                        System.out.println("No solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (M[2] % 2 == 0) {
                        System.out.println("No solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > M[1]) {
                            y = Math.pow(x, M[2]);
                            x = x - 1;
                        }
                        if (y < M[1]) {
                            System.out.println("No solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (M[1] == 0) {
                System.out.println(5);
            } else {
                System.out.println("No solution");
            }
        }
    }
}