import sys

class Task:
    def solve(self, in_, out):
        S = in_.next()
        while len(S) > 3:
            abc = False
            for i in range(len(S) - 2):
                if S[i:i + 3] == "ABC":
                    S = S[:i] + "X" + S[i + 3:]
                    abc = True
            if not abc:
                out.write("No\n")
                return
            check = [False] * 3
            for c in S:
                if c == "X":
                    continue
                check[ord(c) - ord("A")] = True
            if check.count(True)!= 2:
                out.write("No\n")
                return
            for i in range(3):
                if not check[i]:
                    S = S.replace("X", chr(ord("A") + i))
        if S == "ABC":
            out.write("Yes\n")
        else:
            out.write("No\n")

def main():
    solver = Task()
    solver.solve(sys.stdin, sys.stdout)

if __name__ == "__main__":
    main()