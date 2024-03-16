def atcoder_ABC164_D():
    S = input()
    N = len(S)
    mod_arr = [0] * N
    mod_cnt = [0] * 2019
    radix = 1
    
    for i in range(N):
        tmp = (int(S[N - 1 - i]) * radix) % 2019
        if i != 0:
            tmp = (tmp + mod_arr[i - 1]) % 2019
        mod_arr[i] = tmp
        mod_cnt[tmp] += 1
        radix = radix * 10 % 2019
    
    ans = 0
    mod_cnt[0] += 1
    
    for count in mod_cnt:
        ans += count * (count - 1) // 2
    
    print(ans)

# Execute the function
atcoder_ABC164_D()