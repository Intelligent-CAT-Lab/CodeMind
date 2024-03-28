class main:
    import sys
    
    n = int(input())
    if n == 1:
        print("Hello World")
    else:
        a, b = map(int, input().split())
        print(a + b)