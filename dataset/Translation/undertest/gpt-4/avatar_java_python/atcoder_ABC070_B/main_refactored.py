class main:
    def overlap_time(a, b, c, d):
        array = [0] * 101
        
        for i in range(a, b):
            array[i] += 1
            
        for i in range(c, d):
            array[i] += 1
            
        ans = sum(1 for i in range(101) if array[i] == 2)
        
        return ans
    
    # Test input
    input_values = "0 50 50 100"
    a, b, c, d = map(int, input_values.split())
    
    # Expected output
    print(overlap_time(a, b, c, d))