def factorials_mod_billion(n, m):
    result = 1
    mod_val = 1000000007
    for i in range(1, n + 1):
        result = (result * i) % mod_val
    for i in range(1, m + 1):
        result = (result * i) % mod_val
    return result

if __name__ == '__main__':
    n, m = map(int, input().split())

    if abs(n - m) > 1:
        result = 0
    elif abs(n - m) == 1:
        result = factorials_mod_billion(n, m)
    else:
        result = factorials_mod_billion(n, m)
        result = (result * 2) % 1000000007
    
    print(result)