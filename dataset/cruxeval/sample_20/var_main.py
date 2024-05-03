def f(text):
    result = ''	## {"result" : ''}
    for i in range(len(text)-1, -1, -1):	## {"i" : '',"text" : ''}
        result += text[i]	## {"result" : '',"text" : '',"i" : ''}
    return result	## {"result" : ''}
