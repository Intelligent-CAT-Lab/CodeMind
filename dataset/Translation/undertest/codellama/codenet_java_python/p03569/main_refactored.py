class main:
    import sys
    
    def solve(s):
        cnt = 0
        l = 0
        r = len(s) - 1
        while l <= r:
            cl = s[l]
            cr = s[r]
            if cl == cr:
                l += 1
                r -= 1
            elif cl == 'x':
                cnt += 1
                l += 1
            elif cr == 'x':
                cnt += 1
                r -= 1
            else:
                cnt = -1
                break
        return cnt
    
    if __name__ == "__main__":
        s = sys.stdin.readline().strip()
        print(solve(s))