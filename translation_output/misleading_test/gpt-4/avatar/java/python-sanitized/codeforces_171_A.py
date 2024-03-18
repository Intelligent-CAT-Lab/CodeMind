def get_num(a, b):
    reverse_b = int(str(b)[::-1])
    return a + reverse_b

# Test input
a, b = map(int, input().split())

# Compute and print the answer
ans = get_num(a, b)
print(ans)