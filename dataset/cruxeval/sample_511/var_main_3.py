def f(fields, update_dict):
    di = dict((x, '') for x in fields)	## <state>di = CLRJ | x = CLRJ | fields = CLRJ</state>
    di.update(update_dict)	## <state>di = CLRJ | update_dict = CLRJ</state>
    return di	## <state>di = CLRJ</state>
