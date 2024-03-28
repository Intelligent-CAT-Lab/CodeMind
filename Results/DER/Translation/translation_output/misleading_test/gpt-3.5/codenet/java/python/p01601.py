```python
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
        for i in range(len(s) // 2):
            if s[i] != s[len(s) - i - 1]:
                return False
        return True

if __name__ == "__main__":
    p = p01601()
    p.run()
```
