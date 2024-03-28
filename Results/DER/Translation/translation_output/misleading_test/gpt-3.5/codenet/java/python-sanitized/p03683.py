def factorials_mod_billion(n, m):
    result = 1
    modulo = 1000000007
    for i in range(1, n+1):
        result = (result * i) % modulo
    for i in range(1, m+1):
        result = (result * i) % modulo
    return result

def main():
    line = input().split()
    n = int(line[0])
    m = int(line[1])

    result = 0
    if abs(n - m) > 1:
        result = 0
    elif abs(n - m) == 1:
        result = factorials_mod_billion(n, m)
    else:
        result = factorials_mod_billion(n, m)
        result = (result * 2) % 1000000007

    print(result)

if __name__ == "__main__":
    main()