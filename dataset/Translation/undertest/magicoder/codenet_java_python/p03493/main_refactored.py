class main:
    # Python code
    
    def count_marbles(a):
        marbles = 0
        for i in a:
            if i == '1':
                marbles += 1
        return marbles
    
    a = input()
    print(count_marbles(a))
    
    
    Test input:
    101
    
    Expected output:
    2