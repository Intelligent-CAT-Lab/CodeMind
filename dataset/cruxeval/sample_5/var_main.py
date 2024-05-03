def f(text, lower, upper):
    count = 0	## {"count" : ''}
    new_text = list()	## {"new_text" : ''}
    for char in text:	## {"char" : '',"text" : ''}
        char = lower if char.isdecimal() else upper	## {"char" : '',"lower" : '',"upper" : ''}
        if char in ['p', 'C']:	## {"char" : ''}
            count += 1
        new_text.append(char)	## {"new_text" : '',"char" : ''}
    return count, ''.join(new_text)	## {"count" : '',"new_text" : ''}
