def f(text, to_remove):
    new_text = list(text)	## {"new_text" : '',"text" : ''}
    if to_remove in new_text:	## {"to_remove" : '',"new_text" : ''}
        index = new_text.index(to_remove)	## {"index" : '',"new_text" : '',"to_remove" : ''}
        new_text.remove(to_remove)	## {"new_text" : '',"to_remove" : ''}
        new_text.insert(index, '?')	## {"new_text" : '',"index" : ''}
        new_text.remove('?')	## {"new_text" : ''}
    return ''.join(new_text)	## {"new_text" : ''}
