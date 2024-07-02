def f(text, delim):
    return text[:text[::-1].find(delim)][::-1]
f('dsj osq wi w', ' ')