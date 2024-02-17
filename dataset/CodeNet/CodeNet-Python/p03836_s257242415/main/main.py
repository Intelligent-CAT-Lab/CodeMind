# -*- coding: utf-8 -*-

def solve(sx, sy, tx, ty):
    first = "U"*(ty-sy)+"R"*(tx-sx)
    second = "D"*(ty-sy)+"L"*(tx-sx)
    third = "L"+"U"*(ty-sy+1)+"R"*(tx-sx+1)+"D"
    forth = "R"+"D"*(ty-sy+1)+"L"*(tx-sx+1)+"U"
    
    print((first+second+third+forth))
    
if __name__ == '__main__': 
    sx, sy, tx, ty = list(map(int, input().split()))
    
    solve(sx, sy, tx, ty)