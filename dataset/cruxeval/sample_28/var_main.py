def f(mylist):
    revl = mylist[:]	## {"revl" : '',"mylist" : ''}
    revl.reverse()	## {"revl" : ''}
    mylist.sort(reverse=True)	## {"mylist" : ''}
    return mylist == revl	## {"mylist" : '',"revl" : ''}
