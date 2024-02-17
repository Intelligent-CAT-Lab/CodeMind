def f(name):
    new_name =''
    name = name[::-1]
    for i in range(len(name)):
        n = name[i]
        if n !='.' and  new_name.count('.')<2:
            new_name=n+new_name
        else:
            break
    return new_name