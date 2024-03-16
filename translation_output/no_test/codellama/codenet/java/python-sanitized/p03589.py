import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class p03589:
    def solve(self):
        sc = Scanner(System.in)
        N = sc.nextLong()
        for h in range(1, 3500):
            for n in range(1, 3500):
                if (4 * h * n - N * n - N * h != 0) and (N * h * n) / (4 * h * n - N * n - N * h) > 0 and (N * h * n) % (4 * h * n - N * n - N * h) == 0:
                    print(h, n, (N * h * n) / (4 * h * n - N * n - N * h))
                    return