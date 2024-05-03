def eat(number, need, remaining):
    if(need <= remaining):	## need = CLRJ|remaining = CLRJ
        return [ number + need , remaining-need ]	## number = CLRJ|need = CLRJ|remaining = CLRJ
    else:
        return [ number + remaining , 0]
