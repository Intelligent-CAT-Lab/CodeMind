def find_longest_word(input_str):
    # Replace egg and chicken with single characters.
    line = input_str.replace("egg", "e").replace("chicken", "c")
    # Split the string on spaces after replacing double letters with spaced letters
    line = (line.replace("ee", "e e").replace("ee", "e e")
                .replace("cc", "c c").replace("cc", "c c"))
    strs = line.split(" ")
    max_length = 0
    ans = ""
    # Iterate through the split strings and find the longest one.
    for s in strs:
        if max_length < len(s):
            max_length = len(s)
            ans = "egg" if s[-1] == 'e' else "chicken"
    return ans

# Test case
test_input = "eggchickenegg"
expected_output = "egzg"
print(find_longest_word(test_input))