def f(text, char):
    char_index = text.find(char)	## char_index = [] | text = [] | char = []
    result = []	## result = []
    if char_index > 0:	## char_index = []
        result = list(text[:char_index])
    result.extend(list(char)+list(text[char_index+len(char):]))	## result = [] | char = [] | text = [] | char_index = []
    return ''.join(result)	## result = []
