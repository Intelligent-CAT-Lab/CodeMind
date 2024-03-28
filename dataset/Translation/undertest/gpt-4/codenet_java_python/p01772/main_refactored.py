class main:
    def run(input_string):
        c = list(input_string)
        n = len(c)
        s = []
        for i in range(n):
            if c[i] == 'A' or c[i] == 'Z':
                s.append(c[i])
        c = s
        n = len(c)
        s = []
        for i in range(n):
            if len(s) == 0 or s[-1] != c[i]:
                s.append(c[i])
        if len(s) > 0 and s[0] == 'Z':
            s.pop(0)
        if len(s) > 0 and s[-1] == 'A':
            s.pop()
        if len(s) > 0:
            print(''.join(s))
        else:
            print(-1)
    
    # Sample test case:
    input_string = "AIZUNYANPEROPERO"
    run(input_string)  # Expected output: "AZ"