class main:
    def replace_and_print(s):
        count = 0
        for i in range(len(s)):
            if s[i] == 'D' or s[i] == '?':
                count += 1
                s = s[:i] + 'D' + s[i+1:]
        print(s)
    
    # Test input
    replace_and_print('PD?D??P')