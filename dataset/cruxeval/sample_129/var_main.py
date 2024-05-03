def f(text, search_string):
    indexes = []	## {"indexes" : ''}
    while search_string in text:	## {"search_string" : '',"text" : ''}
        indexes.append(text.rindex(search_string))	## {"indexes" : '',"text" : '',"search_string" : ''}
        text = text[:text.rindex(search_string)]	## {"text" : '',"search_string" : ''}
    return indexes	## {"indexes" : ''}
