def find_close_occurrences(s):
    last = [-1] * 26
    for i, char in enumerate(s):
        ch = ord(char) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            return f"{last[ch] + 1} {i + 1}"
        last[ch] = i
    return "-1 -1"

# Sample test case
test_input = "needed"
print(find_close_occurrences(test_input))