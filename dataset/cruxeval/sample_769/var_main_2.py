def f(text):
    text_list = [char for char in text]	## text_list = [] | char = [] | text = []
    for i, char in enumerate(text_list):	## i = [] | char = [] | text_list = []
        text_list[i] = char.swapcase()	## text_list = [] | i = [] | char = []
    return ''.join(text_list)	## text_list = []
