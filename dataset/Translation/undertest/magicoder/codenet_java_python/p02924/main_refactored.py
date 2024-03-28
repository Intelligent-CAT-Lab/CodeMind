class main:
    # Python code
    
    n = int(input())
    
    # ä¸»å¦ç
    result = 0
    for i in range(n - 1, 0, -1):
        result += i
    
    # åºå
    print(result)