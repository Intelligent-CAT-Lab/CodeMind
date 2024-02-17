def f(text, delim):
    return text[:text[::-1].find(delim)][::-1]