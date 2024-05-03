def f(string, numbers):
    arr = []	## arr = []
    for num in numbers:	## num = [] | numbers = []
        arr.append(string.zfill(num))	## arr = [] | string = [] | num = []
    return ' '.join(arr)	## arr = []
