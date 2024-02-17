def f(fields, update_dict):
    di = dict((x, '') for x in fields)
    di.update(update_dict)
    return di