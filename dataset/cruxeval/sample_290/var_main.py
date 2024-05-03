def f(text, prefix):
    if text.startswith(prefix):	## {"text" : '',"prefix" : ''}
        return text.removeprefix(prefix)
    if prefix in text:	## {"prefix" : '',"text" : ''}
        return text.replace(prefix, '').strip()
    return text.upper()	## {"text" : ''}
