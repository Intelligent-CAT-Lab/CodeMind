n = 10
def sequence(n): 
    if n == 1 or n == 2: 
        return 1
    else: 
        return sequence(sequence(n-1)) + sequence(n-sequence(n-1))
print(sequence(n))