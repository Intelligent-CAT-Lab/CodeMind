str1 = "Python"
vowels = ""
for char in str1:
    if char in "aeiouAEIOU":
        vowels += char
result_string = ""
for char in str1:
    if char in "aeiouAEIOU":
        result_string += vowels[-1]
        vowels = vowels[:-1]
    else:
        result_string += char
print(result_string)