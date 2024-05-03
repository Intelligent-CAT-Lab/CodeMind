def f(mylist):
    revl = mylist[:]	## revl = CLRJ | mylist = CLRJ
    revl.reverse()	## revl = CLRJ
    mylist.sort(reverse=True)	## mylist = CLRJ
    return mylist == revl	## mylist = CLRJ | revl = CLRJ
