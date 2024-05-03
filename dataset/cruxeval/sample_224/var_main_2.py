def f(array, value):
    array.reverse()	## array = []
    array.pop()	## array = []
    odd = []	## odd = []
    while len(array) > 0:	## array = []
        tmp = {}
        tmp[array.pop()] = value
        odd.append(tmp)
    result = {}	## result = []
    while len(odd) > 0:	## odd = []
        result.update(odd.pop())
    return result	## result = []
