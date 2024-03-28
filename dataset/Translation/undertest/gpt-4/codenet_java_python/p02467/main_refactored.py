class main:
    # Read the input from the user
    n = int(input())
    
    # Printing the number followed by a colon
    print(f"{n}:", end="")
    
    # Factorizing the number
    i = 2
    while i * i <= n:
        if n % i == 0:
            n = n // i
            print(f" {i}", end="")
        else:
            i += 1
    
    # Printing the last factor
    print(f" {n}")