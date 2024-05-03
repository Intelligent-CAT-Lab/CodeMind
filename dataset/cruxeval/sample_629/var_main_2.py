def f(text, dng):
    if dng not in text:	## dng = [] | text = []
        return text
    if text[-len(dng):] == dng:	## text = [] | dng = []
        return text[:-len(dng)]	## text = [] | dng = []
    return text[:-1] + f(text[:-2], dng)