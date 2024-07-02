def f(concat, di):
    count = len(di)
    for i in range(count):
        if di[str(i)] in concat:
            di.pop(str(i))
    return "Done!"
f('mid', {'0':'q','1':'f','2':'w','3':'i'})