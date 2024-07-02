def f(text, letter):
    t = text
    for alph in text:
        t = t.replace(alph, "")
    return len(t.split(letter))
f("c, c, c ,c, c", "c")