def f(mess, char):
    while mess.find(char, mess.rindex(char) + 1) != -1:	## mess = CLRJ | char = CLRJ
        mess = mess[:mess.rindex(char) + 1] + mess[mess.rindex(char) + 2:]
    return mess	## mess = CLRJ
