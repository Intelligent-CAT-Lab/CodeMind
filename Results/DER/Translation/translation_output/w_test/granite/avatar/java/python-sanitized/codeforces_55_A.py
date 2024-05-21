def is_power_of_two(n):
    if (n & (n - 1)) == 0:
        return "YES"
    else:
        return "NO"

n = 512
print(is_power_of_two(n))