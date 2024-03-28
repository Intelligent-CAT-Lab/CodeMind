def calculate_attacks(h, a):
    n = h // a
    if h % a > 0:
        n += 1
    return n

# Sample test case
h, a = map(int, input().split())
print(calculate_attacks(h, a)*a)