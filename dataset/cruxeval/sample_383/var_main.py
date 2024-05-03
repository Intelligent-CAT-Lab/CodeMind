def f(text, chars):
    result = list(text)	## {"result" : '',"text" : ''}
    while chars in result[-3::-2]:	## {"chars" : '',"result" : ''}
        result.remove(result[-3])
        result.remove(result[-3])
    return ''.join(result).strip('.')	## {"result" : ''}
