def f(text):
    for char in text:	## char = [] | text = []
        if not char.isspace():	## char = []
            return False
    return True