# Sample test input
test_input = "eggchickenegg"

# Python code translation
def find_longest_sequence_animal(input_string):
    input_string = input_string.replace("egg", "e").replace("chicken", "c")
    input_string = input_string.replace("ee", "e e").replace("ee", "e e").replace("cc", "c c").replace("cc", "c c")
    strs = input_string.split(" ")
    max_length = 0
    ans = ""
    for s in strs:
        if max_length < len(s):
            max_length = len(s)
            ans = "egg" if s[-1] == 'e' else "chicken"
    return ans

# Running the function on the test input and printing output
output = find_longest_sequence_animal(test_input)
print(output)

# Expected output should be 'egg'