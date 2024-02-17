def f(names):
    if names == []:
        return ""
    smallest = names[0]
    for name in names[1:]:
        if name < smallest:
            smallest = name
    names.remove(smallest)
    return names.join(smallest)