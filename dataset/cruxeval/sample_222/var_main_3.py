def f(mess, char):
    while mess.find(char, mess.rindex(char) + 1) != -1:	## <state>mess = CLRJ | char = CLRJ</state>
        mess = mess[:mess.rindex(char) + 1] + mess[mess.rindex(char) + 2:]
    return mess	## <state>mess = CLRJ</state>
