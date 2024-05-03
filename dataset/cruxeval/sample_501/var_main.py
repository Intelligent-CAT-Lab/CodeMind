def f(text, char):
    index = text.rindex(char)	## {"index" : '',"text" : '',"char" : ''}
    result = list(text)	## {"result" : '',"text" : ''}
    while index > 0:	## {"index" : ''}
        result[index] = result[index-1]	## {"result" : '',"index" : ''}
        result[index-1] = char	## {"result" : '',"index" : '',"char" : ''}
        index -= 2	## {"index" : ''}
    return ''.join(result)	## {"result" : ''}
