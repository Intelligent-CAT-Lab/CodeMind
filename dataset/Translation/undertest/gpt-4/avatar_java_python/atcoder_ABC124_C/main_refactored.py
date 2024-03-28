class main:
    def atcoder_ABC124_C(s):
        ans1, ans2 = 0, 0
    
        for i, c in enumerate(s):
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
    
        return min(ans1, ans2)
    
    # Test input
    print(atcoder_ABC124_C("0"))
    
    # You can include more test cases if needed