class main:
    import math
    
    def calc(vy, t):
        return vy*t - 0.5*g*t**2
    
    def cmp(lb, ub, a):
        if a < lb+1e-6:
            return -1
        elif a > ub-1e-6:
            return 1
        else:
            return 0
    
    def check(qx, qy):
        a = 0.25*g**2
        b = g*qy - V**2
        c = qx**2 + qy**2
        D = b**2 - 4*a*c
        if D < 0:
            return False
        
        for d in [-1, 1]:
            t2 = (-b + d*math.sqrt(D)) / (2*a)
            if t2 < 0:
                continue
            t = math.sqrt(t2)
            vx = qx / t
            vy = math.sqrt(V**2 - vx**2)
            
            yt = calc(vy, X/vx)
            if yt < Y - 1e-6:
                continue
            
            ok = True