import java.util

class p03999:
    def __init__(self):
        pass

    def main(self):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        ans = 0
        for dx in range(0, s.length()):
            for start in range(0, s.length() - 1 - dx):
                cur = int(s[start:start + dx + 1])
                ans += cur * (self.helper(start) * self.helper(s.length() - 1 - dx - start))
        print(ans)

    def helper(self, n):
        if n == 0:
            return 1
        return 1 << (n - 1)


if __name__ == '__main__':
    p03999().main()