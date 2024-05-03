def f(text, suffix):
    if suffix and text.endswith(suffix):	## {"suffix" : '',"text" : ''}
        return text[:- len(suffix)]
    return text	## {"text" : ''}
