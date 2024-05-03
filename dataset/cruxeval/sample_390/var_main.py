def f(text):
    if not text.strip():	## {"text" : ''}
        return len(text.strip())	## {"text" : ''}
    return None