# No need to import anything for basic input/output in Python

def count_odd_length_numbers(n):
    count = 0
    for i in range(1, n + 1):
        if len(str(i)) % 2 != 0:
            count += 1
    return count

# In Python, the standard input can be taken with input() function
a = int(input())

# Call the function we defined above and print the result
c = count_odd_length_numbers(a)
print(c)