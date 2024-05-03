def Strongest_Extension(class_name, extensions):
    strong = extensions[0]	## strong = CLRJ|extensions = CLRJ
    my_val = len([x for x in extensions[0] if x.isalpha() and x.isupper()]) - len([x for x in extensions[0] if x.isalpha() and x.islower()])	## my_val = CLRJ|x = CLRJ|extensions = CLRJ
    for s in extensions:	## s = CLRJ|extensions = CLRJ
        val = len([x for x in s if x.isalpha() and x.isupper()]) - len([x for x in s if x.isalpha() and x.islower()])	## val = CLRJ|x = CLRJ|s = CLRJ
        if val > my_val:	## val = CLRJ|my_val = CLRJ
            strong = s	## strong = CLRJ|s = CLRJ
            my_val = val	## my_val = CLRJ|val = CLRJ

    ans = class_name + "." + strong	## ans = CLRJ|class_name = CLRJ|strong = CLRJ
    return ans	## ans = CLRJ

