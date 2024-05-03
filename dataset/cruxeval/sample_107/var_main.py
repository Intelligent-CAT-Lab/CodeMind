def f(text):
    result = []	## {"result" : ''}
    for i in range(len(text)):	## {"i" : '',"text" : ''}
        if not text[i].isascii():	## {"text" : '',"i" : ''}
            return False
        elif text[i].isalnum():	## {"text" : '',"i" : ''}
            result.append(text[i].upper())	## {"result" : '',"text" : '',"i" : ''}
        else:
            result.append(text[i])
    return ''.join(result)	## {"result" : ''}
