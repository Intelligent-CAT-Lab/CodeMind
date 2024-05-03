def f(text, chars):
    chars = list(chars)	## {"chars" : ''}
    text = list(text)	## {"text" : ''}
    new_text = text	## {"new_text" : '',"text" : ''}
    while len(new_text) > 0 and text:	## {"new_text" : '',"text" : ''}
        if new_text[0] in chars:	## {"new_text" : '',"chars" : ''}
            new_text = new_text[1:]	## {"new_text" : ''}
        else:
            break 
    return ''.join(new_text)	## {"new_text" : ''}
