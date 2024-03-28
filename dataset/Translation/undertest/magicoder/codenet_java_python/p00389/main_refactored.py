class main:
    def solve(base, K):
        next = 0
        ans = 1
        while base >= 1:
            low = 0
            high = base
            while high - low > 1:
                will_next = (low + high) // 2
                if will_next <= K * (base - will_next):
                    low = will_next
                else:
                    high = will_next
            next = low
    
            if next > 0:
                base = next
                ans += 1
            else:
                break
        return ans
    
    
    # Test input
    base, K = 4, 2
    print(solve(base, K))  # Expected output: 3