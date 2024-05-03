def f(text):
    result = ''	## {"result" : ''}
    mid = (len(text) - 1) // 2	## {"mid" : '',"text" : ''}
    for i in range(mid):	## {"i" : '',"mid" : ''}
        result += text[i]	## {"result" : '',"text" : '',"i" : ''}
    for i in range(mid, len(text)-1):	## {"i" : '',"mid" : '',"text" : ''}
        result += text[mid + len(text) - 1 - i]	## {"result" : '',"text" : '',"mid" : '',"i" : ''}
    return result.ljust(len(text), text[-1])	## {"result" : '',"text" : ''}
