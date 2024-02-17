def f(text):
    text_list = [char for char in text]
    for i, char in enumerate(text_list):
        text_list[i] = char.swapcase()
    return ''.join(text_list)