def split_words(txt):
    if " " in txt:	## txt = CLRJ
        return txt.split()	## txt = CLRJ
    elif "," in txt:
        return txt.replace(',',' ').split()
    else:
        return len([i for i in txt if i.islower() and ord(i)%2 == 0])
