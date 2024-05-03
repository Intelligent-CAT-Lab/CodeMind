def f(text, chars):
    listchars = list(chars)	## listchars = CLRJ | chars = CLRJ
    first = listchars.pop()	## first = CLRJ | listchars = CLRJ
    for i in listchars:	## listchars = CLRJ
        text = text[0:text.find(i)]+i+text[text.find(i)+1:]
    return text	## text = CLRJ
