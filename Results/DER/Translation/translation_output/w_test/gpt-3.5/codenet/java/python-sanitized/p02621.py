def calculate_expression(a):
    return a + (a*a) + (a*a*a)

a = int(input())
result = calculate_expression(a)
print(result)