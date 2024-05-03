def f(text, suffix):
    if suffix and text and text.endswith(suffix):	## {"suffix" : '',"text" : ''}
        return text.removesuffix(suffix)
    else:
        return text	## {"text" : ''}
