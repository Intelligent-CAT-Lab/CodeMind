def f(text, char):
    position = len(text)	## {"position" : '',"text" : ''}
    if char in text:	## {"char" : '',"text" : ''}
        position = text.index(char)	## {"position" : '',"text" : '',"char" : ''}
        if position > 1:	## {"position" : ''}
            position = (position + 1) % len(text)
    return position	## {"position" : ''}
