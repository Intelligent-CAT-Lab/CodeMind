def p03697():
    a, b = map(int, input().split())
    if a + b >= 10:
        print("error")
    else:
        print(a + b)

# Test case
p03697()