def f(text, search_chars, replace_chars):
    trans_table = str.maketrans(search_chars, replace_chars)
    return text.translate(trans_table)