string = '[[]]'
opening_bracket_index = []
closing_bracket_index = []
for i in range(len(string)):
    if string[i] == '[':
        opening_bracket_index.append(i)
    else:
        closing_bracket_index.append(i)
closing_bracket_index.reverse()
cnt = 0
i = 0
l = len(closing_bracket_index)
for idx in opening_bracket_index:
    if i < l and idx < closing_bracket_index[i]:
        cnt += 1
        i += 1
print(cnt >= 2)