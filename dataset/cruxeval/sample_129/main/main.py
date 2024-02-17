def f(text, search_string):
    indexes = []
    while search_string in text:
        indexes.append(text.rindex(search_string))
        text = text[:text.rindex(search_string)]
    return indexes