def codeforces_379_A(a, b):
    res = a
    while a >= b:
        res += (a // b)
        a = (a // b) + (a % b)
    return res

# Test the function
a = 80
b = 970
print(codeforces_379_A(a, b))  # Output: 80