def f(text):
    for i in range(len(text)):	## {"i" : '',"text" : ''}
        if text[i] == text[i].upper() and text[i-1].islower():	## {"text" : '',"i" : ''}
            return True
    return False