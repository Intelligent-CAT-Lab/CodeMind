def bubble_count(a, l, r):
    if r - l <= 1:
        return 0
    m = (l + r) // 2
    ret = bubble_count(a, l, m) + bubble_count(a, m, r)
    temp = a[l:r].copy()
    p0, p1 = 0, m - l
    p = l
    while p < r:
        if p0 == m - l:
            a[p] = temp[p1]
            p1 += 1
        elif p1 == r - l:
            a[p] = temp[p0]
            p0 += 1
        elif temp[p0] <= temp[p1]:
            a[p] = temp[p0]
            p0 += 1
        else:
            a[p] = temp[p1]
            p1 += 1
            ret += m - l - p0
        p += 1
    return ret

def solve(s):
    n = len(s)
    idx = [0] * 26
    
    for char in s:
        c = ord(char) - ord('a')
        idx[c] += 1
    
    a = [[0] * size for size in idx]
    
    map = [-1] * n
    ptr = [0] * 26
    now = 0
    odd_used = -1
    
    for i in range(n):
        c = ord(s[i]) - ord('a')
        odd = idx[c] % 2 == 1
        if odd and odd_used >= 0 and odd_used != c:
            raise ValueError("-1")
        
        p = ptr[c]
        if p < idx[c] // 2:
            map[i] = now
            now += 1
        elif odd and p == idx[c] // 2:
            map[i] = n // 2
            odd_used = c
            
        else:
            inv = idx[c] - p - 1
            map[i] = n - a[c][inv] - 1
        a[c][p] = map[i]
        ptr[c] += 1

    array = [0] * n
    for i in range(n):
        array[map[i]] = i
        
    x = bubble_count(array, 0, n)
    return x

# Test case
print(solve("eel"))  # Expected Output: 49