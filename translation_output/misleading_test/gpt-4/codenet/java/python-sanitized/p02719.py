def min_difference(n, k):
    ans = min(n % k, k - (n % k))
    return ans

# Sample test case
n, k = map(int, input().split())
print(min_difference(n, k))