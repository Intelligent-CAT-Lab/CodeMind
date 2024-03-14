import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class p03560:
    def main(self):
        scan = Scanner(System.in)
        K = scan.nextInt()
        dp = [float('inf')]*K
        Arrays.fill(dp,float('inf'))

        class Node:
            def __init__(self, to, cost):
                self.to = to
                self.cost = cost

        que = PriorityQueue(lambda a, b: a.cost - b.cost)
        for i in range(1, min(10, K)):
            dp[i] = i
            que.add(Node(i, i))
        while not que.isEmpty():
            node = que.poll()
            v = node.to
            c = node.cost
            if c > dp[v]:
                continue
            for i in range(10):
                nextv = (v * 10 + i) % K
                nextc = c + i
                if dp[nextv] > nextc:
                    dp[nextv] = nextc
                    que.add(Node(nextv, nextc))
        print(dp[0])

p03560().main()