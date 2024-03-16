def calculate_fibonacci(n):
    num = [0] * 100

    for i in range(100):
        if i == 0:
            num[i] = 2
        elif i == 1:
            num[i] = 1
        else:
            num[i] = num[i-1] + num[i-2]

    return num[n]

n = int(input())
result = calculate_fibonacci(n)
print(result)