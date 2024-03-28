class main:
    def count_palindromes(a, b):
        count = 0
        for i in range(a, b + 1):
            array = [int(d) for d in str(i)]
            if len(array) == 5 and array[0] == array[4] and array[1] == array[3]:
                count += 1
        return count
    
    # Test input
    a = 11009
    b = 11332
    
    # Expected output
    print(count_palindromes(a, b))