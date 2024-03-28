class main:
    def find_substrings(s):
        str = "$" + s + "$"
        ans, s_val = 0, 0
        for i in range(1, len(str)):
            if str[i] == 'O' and str[i - 1] != 'O':
                s_val = i
            if str[i] == 'O' and str[i + 1] != 'O':
                l = i - s_val + 1
                if s_val >= l and len(str) - i - 1 >= l:
                    ok = True
                    for j in range(l):
                        if str[s_val - 1 - j] != 'J' or str[i + 1 + j] != 'I':
                            ok = False
                            break
                    if ok:
                        ans = max(ans, l)
        return ans
    
    # Test the function with the provided test case
    test_input = "OJJOOIIOJOI"
    print(find_substrings(test_input))