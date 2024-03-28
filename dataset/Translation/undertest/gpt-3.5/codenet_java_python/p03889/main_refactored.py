class main:
    def transform_string(s):
        s = list(s)
        for i in range(len(s)):
            if s[i] == 'b':
                s[i] = 'd'
            elif s[i] == 'd':
                s[i] = 'b'
            elif s[i] == 'p':
                s[i] = 'q'
            elif s[i] == 'q':
                s[i] = 'p'
        transformed_s = ''.join(s)
        if transformed_s == transformed_s[::-1]:
            return "Yes"
        else:
            return "No"
    
    # Test input
    test_input = "pdbq"
    print(transform_string(test_input))