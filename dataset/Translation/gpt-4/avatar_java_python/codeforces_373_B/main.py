import math

class Codeforces_373_B:
    ans = 0

    @staticmethod
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

    @staticmethod
    def binary_search(k, l, r, x):
        while r >= l:
            mid = l + (r - l) // 2
            
            if mid > Codeforces_373_B.ans and mid * k <= x:
                Codeforces_373_B.ans = mid
            
            if k * mid == x:
                return mid
            
            if k * mid > x:
                r = mid - 1
            else:
                l = mid + 1
        
        return -1

def main():
    gen, st, tim = map(int, input().split())
    gen //= tim
    beg, end = st - 1, int(math.pow(10, 18))
    
    while True:
        med = (beg + end) // 2 + 1
        
        if Codeforces_373_B.get(med) - Codeforces_373_B.get(st - 1) > gen:
            end = med - 1
        else:
            beg = med
        
        if beg == end:
            print(beg - st + 1)
            break

if __name__ == "__main__":
    main()