def f(out, mapping):
    for key in mapping:
        out.format_map(mapping)
        if len(re.findall(r'{\w}', out)) == 0:
            break
        mapping[key][1] = mapping[key][1][::-1]
    return out