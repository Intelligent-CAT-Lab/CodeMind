import java.util
import java.io

class p03269:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        l = sc.nextInt()
        k = l
        t = 1
        count = 1
        ans = []
        while l > 1:
            if (l & 1) == 1:
                k -= t
                ans.append(count + " " + 20 + " " + k)
            ans.append(count + " " + (count + 1) + " " + t)
            count += 1
            l >>= 1
            t *= 2
        print(20 + " " + (ans.size() + 19))
        for i in range(19):
            print(i + 1 + " " + (i + 2) + " " + 0)
        for s in ans:
            print(s)