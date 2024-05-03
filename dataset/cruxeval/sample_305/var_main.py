def f(text, char):
    length = len(text)	## {"length" : '',"text" : ''}
    index = -1	## {"index" : ''}
    for i in range(length):	## {"i" : '',"length" : ''}
        if text[i] == char:	## {"text" : '',"i" : '',"char" : ''}
            index = i	## {"index" : '',"i" : ''}
    if index == -1:	## {"index" : ''}
        index = length // 2
    new_text = list(text)	## {"new_text" : '',"text" : ''}
    new_text.pop(index)	## {"new_text" : '',"index" : ''}
    return ''.join(new_text)	## {"new_text" : ''}
