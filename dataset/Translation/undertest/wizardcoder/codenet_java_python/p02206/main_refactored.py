class main:
    import math
    
    def binary_search(n, k):
        left = 1
        right = k + 1
        while right - left > 1:
            m = (left + right) // 2
            x = m
            total = 0
            for i in range(n):
                total += x
                x //= 2
                if total > k:
                    break
            if total <= k:
                left = m
            else:
                right = m
        return left
    
    n, k = map(int, input().split())
    print(binary_search(n, k))