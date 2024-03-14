import java.util.*;

class p03999:
    def main(self, args):
        sc = Scanner(System.in)
        s = sc.next()
        ans = 0
        for dx in range(s.length()):
            for start in range(s.length()-dx):
                cur = int(s[start:start+dx+1])
                ans += cur*(self.helper(start)*self.helper(s.length()-1-dx-start))
        print(ans)

    def helper(self, n):
        if n == 0:
            return 1
        return 1<<(n-1)