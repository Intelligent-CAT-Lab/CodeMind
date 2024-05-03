def f(text, chars):
    listchars = list(chars)	## {"listchars" : '',"chars" : ''}
    first = listchars.pop()	## {"first" : '',"listchars" : ''}
    for i in listchars:	## {"listchars" : ''}
        text = text[0:text.find(i)]+i+text[text.find(i)+1:]
    return text	## {"text" : ''}
