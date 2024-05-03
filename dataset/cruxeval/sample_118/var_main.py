def f(text, chars):
    num_applies = 2	## {"num_applies" : ''}
    extra_chars = ''	## {"extra_chars" : ''}
    for i in range(num_applies):	## {"i" : '',"num_applies" : ''}
        extra_chars += chars	## {"extra_chars" : '',"chars" : ''}
        text = text.replace(extra_chars, '')	## {"text" : '',"extra_chars" : ''}
    return text	## {"text" : ''}
