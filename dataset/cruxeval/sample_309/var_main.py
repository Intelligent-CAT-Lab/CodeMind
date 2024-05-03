def f(text, suffix):
    text += suffix	## {"text" : '',"suffix" : ''}
    while text[-len(suffix):] == suffix:	## {"text" : '',"suffix" : ''}
        text = text[:-1]	## {"text" : ''}
    return text	## {"text" : ''}
