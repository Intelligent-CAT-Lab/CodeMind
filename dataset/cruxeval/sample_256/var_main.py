def f(text, sub):
    a = 0	## {"a" : ''}
    b = len(text) - 1	## {"b" : '',"text" : ''}

    while a <= b:	## {"a" : '',"b" : ''}
        c = (a + b) // 2	## {"c" : '',"a" : '',"b" : ''}
        if text.rfind(sub) >= c:	## {"text" : '',"sub" : '',"c" : ''}
            a = c + 1
        else:
            b = c - 1	## {"b" : '',"c" : ''}

    return a	## {"a" : ''}
