def f(mylist):
    revl = mylist[:]
    revl.reverse()
    mylist.sort(reverse=True)
    return mylist == revl