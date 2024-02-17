text = "c, c, c ,c, c"
letter = "c"
t = text
for alph in text:
    t = t.replace(alph, "")
print(len(t.split(letter)))