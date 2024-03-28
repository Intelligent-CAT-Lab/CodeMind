class main:
    def atcoder_ABC043_B(s):
        while '0B' in s or '1B' in s:
            s = s.replace('0B', '')
            s = s.replace('1B', '')
        
        s = s.replace('B', '')
        return s
    
    # Test case
    input_str = "0000000000"
    output_str = atcoder_ABC043_B(input_str)
    print(output_str)