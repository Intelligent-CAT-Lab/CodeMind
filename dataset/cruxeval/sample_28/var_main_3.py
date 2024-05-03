def f(mylist):
    revl = mylist[:]	## <state>revl = CLRJ | mylist = CLRJ</state>
    revl.reverse()	## <state>revl = CLRJ</state>
    mylist.sort(reverse=True)	## <state>mylist = CLRJ</state>
    return mylist == revl	## <state>mylist = CLRJ | revl = CLRJ</state>
