def check_power_of_two(n):
    if (n & (n - 1)) == 0:
        return "YES"
    else:
        return "NO"

n = int(input())
print(check_power_of_two(n))