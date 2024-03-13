# Python code

# Python does not require importing Scanner or any other Java-specific libraries
# Python uses input() function to get user input

string = input()
count = 0
for i in range(len(string)):
    if string[i] == '2':
        count += 1
print(count)