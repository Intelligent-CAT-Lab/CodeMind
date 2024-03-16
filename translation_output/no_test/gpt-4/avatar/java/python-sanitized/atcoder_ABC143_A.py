# We don't need to import anything in Python to use basic input/output functionality

def atcoder_ABC143_A():
    A = int(input())  # Reading integer input in Python
    B = int(input())
    
    result = A - (B * 2)
    
    if result > 0:
        print(result)  # Printing the result in Python
    else:
        print(0)  # In case (A - B * 2) is not greater than 0, we should print 0

# Executing the function
atcoder_ABC143_A()