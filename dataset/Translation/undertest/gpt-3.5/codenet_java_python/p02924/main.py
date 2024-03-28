def calculate_result(n):
    result = 0
    for i in range(n-1, 0, -1):
        result += i
    return result

n = int(input())
output = calculate_result(n)
print(output)