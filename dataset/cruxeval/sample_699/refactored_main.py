text = "some"
elem = "1"
if elem != '':
    while text.startswith(elem):
        text = text.replace(elem, '')
    while elem.startswith(text):
        elem = elem.replace(text, '')
print([elem, text])