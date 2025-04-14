from typing import *
def split_words(txt):
    if " " in txt:
        return txt.split()
    elif "," in txt:
        return txt.replace(',',' ').split()
    else:
        return len([i for i in txt if i.islower() and ord(i)%2 == 0])

output = split_words("Hello world,!")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_125__1/output.txt", 'w')
file.write(str(output))
file.close()
    