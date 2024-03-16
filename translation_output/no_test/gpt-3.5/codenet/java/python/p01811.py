```python
import sys

class Task:
    def solve(self, inp):
        S = inp.readline().strip()
        while len(S) > 3:
            abc = False
            for i in range(len(S) - 2):
                if S[i:i+3] == "ABC":
                    S = S[:i] + "X" + S[i+3:]
                    abc = True
            if not abc:
                sys.stdout.write("No\n")
                return

            check = [False] * 3
            for char in S:
                if ord(char) - ord('A') >= 3:
                    continue
                check[ord(char) - ord('A')] = True

            cnt = sum(check)
            if cnt != 2:
                sys.stdout.write("No\n")
                return

            for i in range(3):
                if not check[i]:
                    c = chr(i + ord('A'))
                    S = S.replace("X", c)

        if S == "ABC":
            sys.stdout.write("Yes\n")
        else:
            sys.stdout.write("No\n")

def main():
    solver = Task()
    solver.solve(sys.stdin)

if __name__ == "__main__":
    main()
```

