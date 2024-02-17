def f(concat, di):
    count = len(di)
    for i in range(count):
        if di[str(i)] in concat:
            di.pop(str(i))
    return "Done!"