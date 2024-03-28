class main:
    import sys
    
    input_str = sys.stdin.readline().strip()
    
    count = 0
    current_char = input_str[0]
    for i in range(1, len(input_str)):
        if input_str[i] != current_char:
            count += 1
            current_char = input_str[i]
    
    print(count)