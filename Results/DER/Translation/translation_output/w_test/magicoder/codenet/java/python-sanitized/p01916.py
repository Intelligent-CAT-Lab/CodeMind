class p01916:
    def solve(self, s):
        a = [0]*26
        b = [0]*1111

        for i in s:
            a[ord(i)-ord('a')] += 1

        for i in a:
            b[i] += 1

        for i in range(999, -1, -2):
            if b[i] > 0:
                b[i] -= 1
                break

        m = 0

        for i in range(1, 1000, 2):
            m += b[i]

        if m % 2 == 0:
            print(m//2)
        else:
            print(m//2+1)

    def main(self):
        s = input()
        self.solve(s)

if __name__ == "__main__":
    p01916().main()