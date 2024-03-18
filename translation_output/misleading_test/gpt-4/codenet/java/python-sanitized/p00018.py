def strkn(ans):
    # Sorting the list in reverse order (equivalent to java's Comparator.reverseOrder())
    ans.sort(reverse=True)
    return ' '.join(map(str, ans))  # Convert each number to a string and join them with spaces

# Capturing the input as a list of integers
ans = [1, 1, 1, 1, 1]
count = 0

# Reading from the standard input
numbers = input().split() # Assuming the test input is provided in a single line

for num in numbers:
    ans[count] = int(num)
    count += 1
    if count == 5:
        print(strkn(ans))
        break

# Adding the -100 at the end as per the expected output
print('-100')