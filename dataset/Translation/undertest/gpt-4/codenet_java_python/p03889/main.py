def check_mirror_sequence(s):
    char_map = {'b': 'd', 'd': 'b', 'p': 'q', 'q': 'p'}
    transformed = ''.join(char_map.get(c, c) for c in s)
    if transformed[::-1] == s:
        return "Yes"
    else:
        return "No"

# Test input
input_string = "pdbq"
# Expected output
print(check_mirror_sequence(input_string))