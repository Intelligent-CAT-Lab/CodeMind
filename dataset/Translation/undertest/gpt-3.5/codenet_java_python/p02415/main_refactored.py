class main:
    n = input()
    
    for char in n:
        if char.islower():
            print(char.upper(), end="")
        elif char.isupper():
            print(char.lower(), end="")
        else:
            print(char, end="")
    
    print()