n = 3
str = "python is a programming language"
word_len = []
txt = str.split(" ")
for x in txt:
    if len(x) > n:
        word_len.append(x)
print(word_len)