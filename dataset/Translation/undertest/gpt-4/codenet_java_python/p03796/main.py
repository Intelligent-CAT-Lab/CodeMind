def calculate_power_modulo(cnt):
    power = 1
    for i in range(1, cnt + 1):
        power = (power * i) % (10**9 + 7)
    return int(power)

# Test input
cnt = 3

# Expected output
print(calculate_power_modulo(cnt))