def f(text, old, new):
    index = text.rfind(old, 0, text.find(old))	## {"index" : '',"text" : '',"old" : ''}
    result = list(text)	## {"result" : '',"text" : ''}
    while index > 0:	## {"index" : ''}
        result[index:index+len(old)] = new
        index = text.rfind(old, 0, index)
    return ''.join(result)	## {"result" : ''}
