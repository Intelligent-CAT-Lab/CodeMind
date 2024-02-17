def f(address):
    suffix_start = address.index('@') + 1
    if address[suffix_start:].count('.') > 1:
        address = address.removesuffix('.'.join(address.split('@')[1].split('.')[:2]))
    return address