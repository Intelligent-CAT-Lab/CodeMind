def is_power_of_two(n):
    return n != 0 and ((n & (n - 1)) == 0)

n = int(input())

if is_power_of_two(n):
    print("YES")
else:
    print("NO")