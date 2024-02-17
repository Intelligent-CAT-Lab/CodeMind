def f(stg, tabs):
    for tab in tabs:
        stg = stg.rstrip(tab)
    return stg