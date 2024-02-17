st = 'qwbnjrxs'
pattern = ['jr', 'b', 'r', 'qw']
for p in pattern:
    if not st.startswith(p): 
        print(False)
        break
    st = st[len(p):]
else:
    print(True)