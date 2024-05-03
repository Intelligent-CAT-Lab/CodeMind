def f(text, sign):
    length = len(text)	## {"length" : '',"text" : ''}
    new_text = list(text)	## {"new_text" : '',"text" : ''}
    sign = list(sign)	## {"sign" : ''}
    for i in range(len(sign)):	## {"i" : '',"sign" : ''}
        new_text.insert((i * length - 1) // 2 + (i + 1) // 2, sign[i])	## {"new_text" : '',"i" : '',"length" : '',"sign" : ''}
    return ''.join(new_text)	## {"new_text" : ''}
