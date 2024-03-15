class p01601:

    def __init__(self):
        self.INF = 1 << 28
        # self.INF = 1 << 62
        self.EPS = 1e-10

    def run(self):
        n = int(input())
        i = 0
        while True:
            if self.is_palindrome(str(n - i)):
                print(n - i)
                break
            if self.is_palindrome(str(n + i)):
                print(n + i)
                break
            i += 1

    def is_palindrome(self, s):
        return s == s[::-1]

def main():
    p = p01601()
    p.run()

if __name__ == "__main__":
    main()