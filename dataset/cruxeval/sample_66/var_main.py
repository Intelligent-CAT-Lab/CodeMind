def f(text, prefix):
    prefix_length = len(prefix)	## {"prefix_length" : '',"prefix" : ''}
    if text.startswith(prefix):	## {"text" : '',"prefix" : ''}
        return text[(prefix_length - 1) // 2:	## {"text" : '',"prefix_length" : ''}
                    (prefix_length + 1) // 2 * -1:-1]	## {"prefix_length" : ''}
    else:
        return text