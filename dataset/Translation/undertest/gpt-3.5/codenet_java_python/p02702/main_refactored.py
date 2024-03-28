class main:
    def main():
        str_input = input()
        n = len(str_input)
        p = 2019
        ans = 0
        d = [0] * (n + 1)
        ten = 1
    
        for i in range(n - 1, -1, -1):
            a = ((int(str_input[i]) - 0) * ten) % p
            d[i] = (d[i + 1] + a) % p
            ten = (ten * 10) % p
    
        map_counts = {}
        for i in range(n, -1, -1):
            key = d[i]
            map_counts[key] = map_counts.get(key, 0) + 1
    
        for val in map_counts.values():
            ans += val * (val - 1) // 2
    
        print(ans)
    
    if __name__ == '__main__':
        main()