def eat(number, need, remaining):
    if(need <= remaining):
        return [ number + need , number + remaining-need ]
    else:
        return [ number + need + remaining , 0]
