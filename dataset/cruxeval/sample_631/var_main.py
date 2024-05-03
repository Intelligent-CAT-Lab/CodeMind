def f(text, num):
    req = num - len(text)	## {"req" : '',"num" : '',"text" : ''}
    text = text.center(num, '*')	## {"text" : '',"num" : ''}
    return text[:req // 2: -req // 2]	## {"text" : '',"req" : ''}
