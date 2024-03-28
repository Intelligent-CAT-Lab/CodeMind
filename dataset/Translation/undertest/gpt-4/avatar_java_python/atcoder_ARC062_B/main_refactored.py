class main:
    # Since input in Python is read as a string,
    # we don't need to call toCharArray() explicitly.
    input_str = input()
    
    result = 0
    p = 0
    g = 1
    
    # In Python, strings are iterable, so we can directly loop over characters.
    for i in range(1, len(input_str)):
        if input_str[i] == 'g':
            if p + 1 <= g:
                result += 1
                p += 1
            else:
                g += 1
        else:
            if p + 1 <= g:
                p += 1
            else:
                g += 1
                result -= 1
    
    print(result)