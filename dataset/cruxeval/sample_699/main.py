def f(text, elem):
    if elem != '':
        while text.startswith(elem):
            text = text.replace(elem, '')
        while elem.startswith(text):
            elem = elem.replace(text, '')
    return [elem, text]