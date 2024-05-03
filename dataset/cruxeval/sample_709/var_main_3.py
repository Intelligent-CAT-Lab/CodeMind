def f(text):
    my_list = text.split()	## <state>my_list = CLRJ | text = CLRJ</state>
    my_list.sort(reverse=True)	## <state>my_list = CLRJ</state>
    return ' '.join(my_list)	## <state>my_list = CLRJ</state>
