def f(text):
    string_a, string_b = text.split(',')
    return -(len(string_a) + (len(string_b)))