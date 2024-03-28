class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        ans = 101
        for i in range(26):
            target = chr(i + ord('a'))
            cur = 0
            max = 0
            for j in range(len(s)):
                if s[j] == target:
                    cur = 0
                else:
                    cur += 1
                    max = max if max > cur else cur
            ans = min(ans, max)
        print(ans)
    
    if __name__ == '__main__':
        main()