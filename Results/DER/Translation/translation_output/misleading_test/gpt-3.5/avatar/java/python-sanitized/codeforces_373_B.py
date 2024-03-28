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

def binarySearch(k, l, r, x):
    global ans
    if r >= l:
        mid = l + (r - l) // 2
        
        if mid > ans and mid * k <= x:
            ans = mid
        
        if k * mid == x:
            return mid
        
        if k * mid > x:
            return binarySearch(k, l, mid - 1, x)
        
        return binarySearch(k, mid + 1, r, x)
    
    return -1

import sys
ans = 0
data = sys.stdin.readline().split()
gen, st, tim = map(int, data)
gen //= tim
beg, end = st - 1, 10 ** 18

while True:
    med = (beg + end) // 2 + 1
    
    if get(med) - get(st - 1) > gen:
        end = med - 1
    else:
        beg = med
        
    if beg == end:
        print(beg - st + 1)
        break