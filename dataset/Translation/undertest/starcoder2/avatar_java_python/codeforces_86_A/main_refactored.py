class main:
    import sys
    
    def power(a):
        res = 0
        while a > 0:
            res += 1
            a = a / 10
        return res
    
    def mult(a):
        pow = power(a)
        max = 0
        for j in range(pow):
            max = max * 10 + 9
        return a * (max - a)
    
    l, r = map(int, sys.stdin.readline().split())
    res = 0
    maxxes = [0] * 10
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        maxxes[i] = temp / 2 * (temp - temp / 2)
    res = max(mult(l), res)
    res = max(mult(r), res)
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        if l <= temp / 2 and temp / 2 <= r:
            res = max(maxxes[i], res)
    print res
    
    /source/_posts/2017-03-20-codeforces-84-A.md
    ---
    title: codeforces 84 A
    date: 2017-03-20 16:00:00
    tags: [codeforces, python]
    ---
    
    Translate the following java code to python and enclose your solution inside .
    A sample test case is provided below:
    
    Test input:
    1 1
    
    Expected output:
    1
    
    
    
    import java.util.Scanner;
    
    public class codeforces_84_A {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int res = 0;
            for (int i = 1; i <= n; ++i) {
                if (i % k == 0)
                    res++;
            }
            System.out.println(res);
        }
    }