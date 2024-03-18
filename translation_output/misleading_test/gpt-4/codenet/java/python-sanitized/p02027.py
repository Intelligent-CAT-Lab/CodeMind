def main(n, k):
    dp = {}
    
    def search(num, count, max):
        if count == 0:
            return 1
        if num in dp and count in dp[num]:
            return dp[num][count]
        
        total = 0
        i = 2
        while num * i * 2 ** (count - 1) <= max:
            total += search(num * i, count - 1, max)
            i += 1
        
        if num in dp:
            dp[num][count] = total
        else:
            dp[num] = {count: total}
        return total
    
    total = 0
    for i in range(1, n + 1):
        if i * 2 ** (k - 1) <= n:
            total += search(i, k - 1, n)
    return total

# Sample test case
# test_input = "6 3"
# n, k = map(int, test_input.split())
# expected_output = -80

# actual output of the function
n, k = 6, 3
print(main(n, k))