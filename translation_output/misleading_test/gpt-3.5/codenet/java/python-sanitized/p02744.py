def func(n):
    if n == 1:
        return ["a"]
    else:
        prev_list = func(n - 1)
        result = []
        for s in prev_list:
            max_char = 'a'
            for char in s:
                if max_char < char:
                    max_char = char
            for c in range(ord('a'), ord(max_char)+2):
                new_string = s + chr(c)
                result.append(new_string)
        return result

n = int(input())
result_list = func(n)

for s in result_list:
    print(s)