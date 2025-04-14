from typing import *
def words_in_sentence(sentence):
    new_lst = []
    for word in sentence.split():
        flg = 0
        if len(word) == 1:
            flg = 1
        for i in range(2, len(word)):
            if len(word)%i == 0:
                flg = 1
        if flg == 0 or len(word) == 2:
            new_lst.append(word)
    return " ".join(new_lst)

output = words_in_sentence("there is no place available here")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_143__0/output.txt", 'w')
file.write(str(output))
file.close()
    