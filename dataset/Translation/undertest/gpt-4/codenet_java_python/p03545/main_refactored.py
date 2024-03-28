class main:
    str_input = input()
    
    ch = [str_input[i] for i in range(4)]
    a, b, c, d = [int(ch[i]) for i in range(4)]
    
    operations = ['+', '+', '+']  # Initialize with all pluses; will be changed later if needed
    
    if a + b + c + d == 7:
        pass  # operations already set to ['+', '+', '+']
    elif a + b + c - d == 7:
        operations[2] = '-'
    elif a + b - c + d == 7:
        operations[1] = '-'
    elif a - b + c + d == 7:
        operations[0] = '-'
    elif a + b - c - d == 7:
        operations[1] = operations[2] = '-'
    elif a - b + c - d == 7:
        operations[0] = operations[2] = '-'
    elif a - b - c + d == 7:
        operations[0] = operations[1] = '-'
    elif a - b - c - d == 7:
        operations[0] = operations[1] = operations[2] = '-'
    
    print(f"{a}{operations[0]}{b}{operations[1]}{c}{operations[2]}{d}=7")