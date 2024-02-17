s = "Hi, my name is John"
if not s:
    s_list = []
else:
    s_list = []
    for letter in s:
        if letter == ',':
            s_list.append(' ')
        else:
            s_list.append(letter)

s_list = "".join(s_list)
print(s_list.split())