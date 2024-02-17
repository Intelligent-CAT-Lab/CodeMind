K = int("0")
N = 50
div = K // N
mod = K % N
A = [i + div - mod for i in range(N)]
for i in range(mod):
  A[i] += N + 1
print(N)
print(' '.join([str(a) for a in A]))