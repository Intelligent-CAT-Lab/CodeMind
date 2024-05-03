def func(n):
    if n == 1:
        return ["a"]
    else:
        prev_list = func(n - 1)
        new_list = []
        for s in prev_list:
            max_char = max(s)
            for c in range(ord(max_char) + 1, ord('z') + 1):
                new_string = s + chr(c)
                new_list.append(new_string)
        return new_list

n = int(input())
result = func(n)
for s in result:
    print(s)