def f(l1, l2):
    if len(l1) != len(l2):
        return {}
    return dict.fromkeys(l1, l2)