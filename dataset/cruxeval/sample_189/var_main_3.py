def f(out, mapping):
    for key in mapping:	## <state>mapping = CLRJ</state>
        out.format_map(mapping)
        if len(re.findall(r'{\w}', out)) == 0:
            break
        mapping[key][1] = mapping[key][1][::-1]
    return out	## <state>out = CLRJ</state>
