class main:
    def p03416(a, b):
        count = 0
        for i in range(a, b+1):
            array = [i % 10, i // 10 % 10, i // 100 % 10, i // 1000 % 10, i // 10000 % 10]
            if array[0] == array[4] and array[1] == array[3]:
                count += 1
        return count
    
    # Test input
    a = 11009
    b = 11332
    
    # Expected output
    print(p03416(a, b))