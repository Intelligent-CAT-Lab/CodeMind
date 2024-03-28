class main:
    import sys
    
    def get_d(s):
        d = [0] * len(s)
        ten = 1
        for i in range(len(s)-1, -1, -1):
            a = ((ord(s[i]) - ord('0')) * ten) % 2019
            d[i] = (d[i+1] + a) % 2019
            ten = (ten * 10) % 2019
        return d
    
    def get_ans(d):
        map = {}
        for i in d:
            if i not in map:
                map[i] = 1
            else:
                map[i] += 1
        ans = 0
        for i in map:
            ans += (map[i] * (map[i] - 1)) // 2
        return ans
    
    if __name__ == "__main__":
        s = sys.stdin.readline().strip()
        d = get_d(s)
        ans = get_ans(d)
        print(ans)