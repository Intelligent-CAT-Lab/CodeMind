class main:
    def get(a):
        ret = 0
        now = 1
        t = 1
        
        while True:
            if now * 10 > a:
                ret += (a - now + 1) * t
                break
            
            ret += now * 9 * t
            now *= 10
            t += 1
        
        return ret
    
    def binary_search(k, l, r, x):
        global ans
        if r >= l:
            mid = l + (r - l) // 2
            
            if mid > ans and mid * k <= x:
                ans = mid
            
            if k * mid == x:
                return mid
            
            if k * mid > x:
                return binary_search(k, l, mid - 1, x)
            
            return binary_search(k, mid + 1, r, x)
        
        return -1
    
    ans = 0
    
    def main():
        global ans
        gen, st, tim = map(int, input().split())
        gen //= tim
        beg = st - 1
        end = 10**18
        
        while True:
            med = (beg + end) // 2 + 1
            
            if get(med) - get(st - 1) > gen:
                end = med - 1
            else:
                beg = med
            
            if beg == end:
                print(beg - st + 1)
                break
    
    if __name__ == "__main__":
        main()