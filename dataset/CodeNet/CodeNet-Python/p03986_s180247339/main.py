from collections import deque
x = input()
n = len(x)
st = deque()

for i in range(n):
    if x[i] == "S":
        st.append("S")
    else:
        if st == deque([]):
            st.append("T")
        else:
            a = st.pop()
            if a == "T":
                st.append("T")
                st.append("T")
            else:
                continue
                
print(len(st))