def f(text):
    length = len(text) // 2	## length = [] | text = []
    left_half = text[:length]	## left_half = [] | text = [] | length = []
    right_half = text[length:][::-1]	## right_half = [] | text = [] | length = []
    return left_half + right_half	## left_half = [] | right_half = []
