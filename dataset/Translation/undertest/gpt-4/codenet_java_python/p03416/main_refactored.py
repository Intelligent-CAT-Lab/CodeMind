class main:
    a, b = map(int, input().split())
    count = 0
    for i in range(a, b + 1):
        number_str = str(i)
        if number_str == number_str[::-1]:  # This checks if the string is a palindrome
            count += 1
    print(count)