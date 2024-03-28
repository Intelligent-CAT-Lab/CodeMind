class main:
    def check_string(str):
        abc = [0, 0, 0]
        for i in str:
            if i in "abc":
                abc[ord(i) - ord('a')] += 1
    
        abc.sort()
    
        return "YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO"
    
    # Test input
    input_str = "abac"
    # Expected output
    print(check_string(input_str))