class main:
    def find_lucky_number(number):
        ans = -1
        value = 0
        mask = 2
    
        while value < number:
            s = bin(mask)[3:]  # Get binary string representation without '0b' and the leading 1
            zeros = s.count('0')
    
            if zeros != len(s) - zeros:
                mask += 1
                continue
    
            s = s.replace('0', '4').replace('1', '7')
            value = int(s)
            mask += 1
    
        return value
    
    # Test case
    print(find_lucky_number(77777777))