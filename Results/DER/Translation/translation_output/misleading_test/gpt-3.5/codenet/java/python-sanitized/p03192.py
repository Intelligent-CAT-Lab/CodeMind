def count_twos(string):
    count = 0
    for char in string:
        if char == '2':
            count += 1
    return count

input_string = input()
result = count_twos(input_string)
print(-result)