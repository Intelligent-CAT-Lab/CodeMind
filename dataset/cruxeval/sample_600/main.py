def f(array):
    just_ns = list(map(lambda num: 'n'*num, array))
    final_output = []
    for wipe in just_ns:
        final_output.append(wipe)
    return final_output