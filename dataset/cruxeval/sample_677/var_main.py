def f(text, length):
    length = -length if length < 0 else length	## {"length" : ''}
    output = ''	## {"output" : ''}
    for idx in range(length):	## {"idx" : '',"length" : ''}
        if text[idx % len(text)] != ' ':	## {"text" : '',"idx" : ''}
            output += text[idx % len(text)]	## {"output" : '',"text" : '',"idx" : ''}
        else:
            break
    return output	## {"output" : ''}
