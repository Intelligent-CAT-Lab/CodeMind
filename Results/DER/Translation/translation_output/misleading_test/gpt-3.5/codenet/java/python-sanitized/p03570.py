class TaskD:
    def solve(self, s):
        d = [float('inf')] * (1 << 26)
        d[0] = 0
        mask, ans = 0, len(s)
        for i in range(len(s)):
            c = ord(s[i]) - ord('a')
            mask ^= 1 << c
            for j in range(-1, 26):
                m = 0 if j < 0 else (1 << j)
                cur = 1 + d[m ^ mask]
                d[mask] = min(d[mask], cur)
                if i == len(s) - 1:
                    ans = min(ans, cur)
        
        return ans

def main():
    s = input()
    solver = TaskD()
    result = solver.solve(s)
    print(result)

if __name__ == "__main__":
    main()