class p02251:
    def solve(self, n):
        ans = 0
        
        # 25 cents
        ans += n // 25
        n %= 25
        
        # 10 cents
        ans += n // 10
        n %= 10
        
        # 5 cents
        ans += n // 5
        n %= 5
        
        # 1 cent
        ans += n

        return ans

# Test input
test_input = 100

# Expected output: 82
solution = p02251()
print(solution.solve(test_input))