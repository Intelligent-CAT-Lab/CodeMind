def f(price, product):
    inventory = ['olives', 'key', 'orange']	## inventory = []
    if product not in inventory:	## product = [] | inventory = []
        return price	## price = []
    else:
        price *=.85
        inventory.remove(product)
    return price