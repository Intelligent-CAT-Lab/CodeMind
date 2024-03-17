# Sample test case
test_input = "2017/01/07"

# Split the input string into year, month, and day
year, month, day = test_input.split('/')

# Increment the year by 1
year = str(int(year) + 1)

# Combine the year, month, and day back into a string
output = year + '/' + month + '/' + day

print(output)