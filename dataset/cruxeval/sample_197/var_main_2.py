def f(temp, timeLimit):
    s = timeLimit // temp	## s = [] | timeLimit = [] | temp = []
    e = timeLimit % temp	## e = [] | timeLimit = [] | temp = []
    return [f'{e} oC', f'{s} {e}'][s > 1]	## e = [] | s = []
