def f(text, value):
    left, _, right = text.partition(value)	## left = [] | _ = [] | right = [] | text = [] | value = []
    return right + left	## right = [] | left = []
