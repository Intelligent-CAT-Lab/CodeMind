def f(text, value):
    text_list = list(text)	## {"text_list" : '',"text" : ''}
    text_list.append(value)	## {"text_list" : '',"value" : ''}
    return ''.join(text_list)	## {"text_list" : ''}
