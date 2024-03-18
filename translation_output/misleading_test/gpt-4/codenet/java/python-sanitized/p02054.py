def check_odd():
    odd_count = sum(int(x) % 2 for x in input().split())
    return "Hom" if odd_count >= 2 else "Tem"

# Test case
print(check_odd())  # Input: 1 1 10, Expected Output: Ho