def f(text, prefix):
    idx = 0	## {"idx" : ''}
    for letter in prefix:	## {"letter" : '',"prefix" : ''}
        if text[idx] != letter:	## {"text" : '',"idx" : '',"letter" : ''}
            return None
        idx += 1	## {"idx" : ''}
    return text[idx:]	## {"text" : '',"idx" : ''}
