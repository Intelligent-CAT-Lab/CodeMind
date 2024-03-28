def find_length(s):
    for i in range(len(s), 0, -2):
        substring = s[:i]
        half = len(substring) // 2
        if substring[:half] == substring[half:]:
            return len(substring)

s = input()
print(find_length(s))