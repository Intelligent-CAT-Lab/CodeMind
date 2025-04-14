from typing import *
def select_words(s, n):
    result = []
    for word in s.split():
        n_consonants = 0
        for i in range(0, len(word)):
            if word[i].lower() not in ["a","e","i","o","u"]:
                n_consonants += 1 
        if n_consonants == n:
            result.append(word)
    return result


output = select_words("Mary had a little lamb", 4) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_117/output.txt", 'w')
file.write(str(output))
file.close()
    