from typing import *
def words_string(s):
    if not s:
        return []

    s_list = []

    for letter in s:
        if letter == ',':
            s_list.append(' ')
        else:
            s_list.append(letter)

    s_list = "".join(s_list)
    return s_list.split()

output = words_string("One,, two, three, four, five, six,")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_101__1/output.txt", 'w')
file.write(str(output))
file.close()
    