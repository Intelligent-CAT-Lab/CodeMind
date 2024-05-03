def f(text, elem):
    if elem != '':	## elem = []
        while text.startswith(elem):	## text = [] | elem = []
            text = text.replace(elem, '')
        while elem.startswith(text):	## elem = [] | text = []
            elem = elem.replace(text, '')
    return [elem, text]	## elem = [] | text = []
