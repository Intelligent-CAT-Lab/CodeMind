def problem_02939(input_str):
    s = list(input_str)
    n = len(s)
    count = 0
    i = 0
    while i < n:
        count += 1
        if i + 1 >= n:
            break
        if s[i] == s[i + 1]:
            if i + 2 >= n:
                break
            i += 3
            count += 1
        else:
            i += 1
    return count

# Test case
input_data = "aabbaa"
print(problem_02939(input_data))