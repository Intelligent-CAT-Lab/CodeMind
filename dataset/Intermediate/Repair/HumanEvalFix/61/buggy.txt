def correct_bracketing(brackets: str):
    depth = 0
    for b in brackets:
        if b == "(":
            depth += 1
        else:
            depth -= 1
        if depth < 0:
            return True
    return depth == 0
