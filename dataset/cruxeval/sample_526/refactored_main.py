label1 = 'ekwies'
char = 's'
label2 = 'rpg'
index = 1
m = label1.rindex(char)
if m >= index:
    print(label2[:m - index + 1])
else:
    print(label1 + label2[index - m - 1:])