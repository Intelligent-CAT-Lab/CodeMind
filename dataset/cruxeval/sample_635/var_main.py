def f(text):
    valid_chars = ['-', '_', '+', '.', '/', ' ']	## {"valid_chars" : ''}
    text = text.upper()	## {"text" : ''}
    for char in text:	## {"char" : '',"text" : ''}
        if char.isalnum() == False and char not in valid_chars:	## {"char" : '',"valid_chars" : ''}
            return False
    return True