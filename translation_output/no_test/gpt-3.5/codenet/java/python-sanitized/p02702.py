def main():
    str = input()
    c = list(str)
    n = len(str)
    p = 2019

    ans = 0
    d = [0] * (n + 1)
    ten = 1

    for i in range(n - 1, -1, -1):
        a = (int(c[i]) * ten) % p
        d[i] = (d[i+1] + a) % p
        ten = (ten * 10) % p

    map = {}
    for i in range(n, -1, -1):
        key = d[i]
        if key not in map:
            map[key] = 1
        else:
            map[key] += 1
    
    for key, val in map.items():
        ans += val * (val - 1) // 2
        
    print(ans)

if __name__ == "__main__":
    main()