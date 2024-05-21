def atcoder_ABC124_C():
    s = input()
    ans1 = 0
    ans2 = 0
    
    for i in range(len(s)):
        c = s[i]
        
        if i % 2 == 0:
            if c == '0':
                ans1 += 1
            else:
                ans2 += 1
        else:
            if c == '1':
                ans1 += 1
            else:
                ans2 += 1
    
    print(min(ans1, ans2))

atcoder_ABC124_C()