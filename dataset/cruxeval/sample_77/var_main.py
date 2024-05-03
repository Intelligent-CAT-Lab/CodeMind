def f(text, character):
    subject = text[text.rfind(character):]	## {"subject" : '',"text" : '',"character" : ''}
    return subject*text.count(character)	## {"subject" : '',"text" : '',"character" : ''}
