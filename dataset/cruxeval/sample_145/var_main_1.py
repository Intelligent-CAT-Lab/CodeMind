def f(price, product):
    inventory = ['olives', 'key', 'orange']	## inventory = CLRJ
    if product not in inventory:	## product = CLRJ | inventory = CLRJ
        return price	## price = CLRJ
    else:
        price *=.85
        inventory.remove(product)
    return price