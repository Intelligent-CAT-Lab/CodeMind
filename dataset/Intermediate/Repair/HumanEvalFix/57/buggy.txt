def monotonic(l: list):
    if l == sorted(l) or l == sorted(l, reverse=True):
        return False
    return True
