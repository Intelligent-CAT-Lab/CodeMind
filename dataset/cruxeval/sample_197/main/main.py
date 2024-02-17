def f(temp, timeLimit):
    s = timeLimit // temp
    e = timeLimit % temp
    return [f'{e} oC', f'{s} {e}'][s > 1]