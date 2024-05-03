def f(price, product):
    inventory = ['olives', 'key', 'orange']	## <state>inventory = CLRJ</state>
    if product not in inventory:	## <state>product = CLRJ | inventory = CLRJ</state>
        return price	## <state>price = CLRJ</state>
    else:
        price *=.85
        inventory.remove(product)
    return price