def f(address):
    suffix_start = address.index('@') + 1	## <state>suffix_start = CLRJ | address = CLRJ</state>
    if address[suffix_start:].count('.') > 1:	## <state>address = CLRJ | suffix_start = CLRJ</state>
        address = address.removesuffix('.'.join(address.split('@')[1].split('.')[:2]))
    return address	## <state>address = CLRJ</state>
