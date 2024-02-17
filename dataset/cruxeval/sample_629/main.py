def f(text, dng):
    if dng not in text:
        return text
    if text[-len(dng):] == dng:
        return text[:-len(dng)]
    return text[:-1] + f(text[:-2], dng)