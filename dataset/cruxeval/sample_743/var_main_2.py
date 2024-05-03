def f(text):
    string_a, string_b = text.split(',')	## string_a = [] | string_b = [] | text = []
    return -(len(string_a) + (len(string_b)))	## string_a = [] | string_b = []
