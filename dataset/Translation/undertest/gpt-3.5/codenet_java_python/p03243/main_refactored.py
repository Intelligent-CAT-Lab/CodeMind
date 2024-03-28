class main:
    def find_multiple_of_111(n):
        for i in range(n, 1000):
            if i % 111 == 0:
                return i
    
    # Test case
    n = 111
    result = find_multiple_of_111(n)
    print(result)