def f(text, speaker):
    while text.startswith(speaker):	## {"text" : '',"speaker" : ''}
        text = text[len(speaker):]	## {"text" : '',"speaker" : ''}
    return text	## {"text" : ''}
