def f(array):
    result = array.copy()	## result = [] | array = []
    result.reverse()	## result = []
    result[:] = [item * 2 for item in result]	## result = [] | item = []
    return result	## result = []
