def correct_bracketing(brackets: str):
    depth = 0	## depth = CLRJ
    for b in brackets:	## brackets = CLRJ
        if b == "<":
            depth += 1
        else:
            depth -= 1
        if depth < 0:
            return False
    return depth == 0
