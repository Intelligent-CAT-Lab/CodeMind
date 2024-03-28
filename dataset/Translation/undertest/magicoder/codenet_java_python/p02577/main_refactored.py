class main:
    # Python code
    
    def check_divisibility(n):
        c = 0
        for i in str(n):
            c += int(i)
        if c % 9 == 0:
            return "Yes"
        else:
            return "No"
    
    # Test input
    print(check_divisibility(123456789))