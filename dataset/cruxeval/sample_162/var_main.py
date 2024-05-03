def f(text):
    result = ''	## {"result" : ''}
    for char in text:	## {"char" : '',"text" : ''}
        if char.isalnum():	## {"char" : ''}
            result += char.upper()	## {"result" : '',"char" : ''}
    return result	## {"result" : ''}
