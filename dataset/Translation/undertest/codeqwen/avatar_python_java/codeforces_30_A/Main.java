import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_30_A {
    public static void main(String[] args) {
        List<Integer> M = Arrays.stream(input().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int a = M.get(0);
        int b = M.get(1);
        int n = M.get(2);
        if (a != 0) {
            if (b % a != 0) {
                System.out.println("No solution");
            } else {
                b = b / a;
                int x = 0;
                int y = -2000;
                if (b >= 0) {
                    while (y < b) {
                        y = (int) Math.pow(x, n);
                        x = x + 1;
                    }
                    if (y > b) {
                        System.out.println("No solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (n % 2 == 0) {
                        System.out.println("No solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > b) {
                            y = (int) Math.pow(x, n);
                            x = x - 1;
                        }
                        if (y < b) {
                            System.out.println("No solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (b == 0) {
                System.out.println(5);
            } else {
                System.out.println("No solution");
            }
        }
    }

    private static String input