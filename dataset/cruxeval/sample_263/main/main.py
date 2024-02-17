def f(base, delta):
    for j in range(len(delta)):
        for i in range(len(base)):
            if base[i] == delta[j][0]:
                assert delta[j][1] != base[i]
                base[i] = delta[j][1]
    return base