def find_missing_character(string):
    count = [0] * 26
    
    for char in string:
        count[ord(char) - 97] += 1

    for i in range(26):
        if count[i] == 0:
            return chr(i + 97) 
    return "None"

# Test input
test_input = "atcoderregularcontest"
# Expected output: b
print(find_missing_character(test_input))