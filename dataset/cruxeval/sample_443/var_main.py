def f(text):
    for space in text:	## {"space" : '',"text" : ''}
        if space == ' ':	## {"space" : ''}
            text = text.lstrip()	## {"text" : ''}
        else:
            text = text.replace('cd', space)	## {"text" : '',"space" : ''}
    return text	## {"text" : ''}
