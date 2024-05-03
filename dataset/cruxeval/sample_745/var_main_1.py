def f(address):
    suffix_start = address.index('@') + 1	## suffix_start = CLRJ | address = CLRJ
    if address[suffix_start:].count('.') > 1:	## address = CLRJ | suffix_start = CLRJ
        address = address.removesuffix('.'.join(address.split('@')[1].split('.')[:2]))
    return address	## address = CLRJ
