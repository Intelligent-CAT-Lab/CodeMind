def f(temp, timeLimit):
    s = timeLimit // temp	## s = CLRJ | timeLimit = CLRJ | temp = CLRJ
    e = timeLimit % temp	## e = CLRJ | timeLimit = CLRJ | temp = CLRJ
    return [f'{e} oC', f'{s} {e}'][s > 1]	## e = CLRJ | s = CLRJ
