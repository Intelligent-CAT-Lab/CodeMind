class main:
    import re
    
    input_str = input()
    
    print(re.sub(r',', ' ', input_str))