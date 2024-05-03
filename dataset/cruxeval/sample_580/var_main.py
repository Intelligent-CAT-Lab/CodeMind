def f(text, char):
    new_text = text	## {"new_text" : '',"text" : ''}
    a = []	## {"a" : ''}
    while char in new_text:	## {"char" : '',"new_text" : ''}
        a.append(new_text.index(char))	## {"a" : '',"new_text" : '',"char" : ''}
        new_text = new_text.replace(char,"",1)	## {"new_text" : '',"char" : ''}
    return a	## {"a" : ''}
