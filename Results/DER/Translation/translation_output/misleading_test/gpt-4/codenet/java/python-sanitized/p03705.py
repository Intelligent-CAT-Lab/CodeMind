def p03705(n, a, b):
    
    if a > b or (n == 1 and a != b):
        return 0
    if a == b:
        return 1
    
    return (n - 2) * (b - a) + 1


# Test case
input_data = "4 4 6"
n, a, b = map(int, input_data.split())
print(p03705(n, a, b))