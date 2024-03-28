class main:
    # Python code
    
    # Read input from user
    numbers = list(map(int, input().split()))
    
    # Count the number of odd numbers
    odd = sum(num % 2 for num in numbers)
    
    # Print the result
    print("Hom" if odd >= 2 else "Tem")