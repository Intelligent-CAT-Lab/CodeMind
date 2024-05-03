def f(text):
    text = text.lower()	## {"text" : ''}
    capitalize = text.capitalize()	## {"capitalize" : '',"text" : ''}
    return text[:1] + capitalize[1:]	## {"text" : '',"capitalize" : ''}
