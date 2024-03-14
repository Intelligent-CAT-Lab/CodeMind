import java.util.*;

class p02903:
  def main(self):
    sc = Scanner(System.in)
    h = Integer.parseInt(sc.next())
    w = Integer.parseInt(sc.next())
    a = Integer.parseInt(sc.next())
    b = Integer.parseInt(sc.next())
    #int c[][] = new int[h][w];
    s1 = ""
    s2 = ""
    
    for j in range(w):
      if j < a:
        s1 = s1 + "0"
        s2 = s2 + "1"
      else:
        s1 = s1 + "1"
        s2 = s2 + "0"
    
    for i in range(h):
        if i < b:
          print(s1)
        elif i >= b:
          print(s2)
        print()

#    for i in range(h):
#      for j in range(w):
#        System.out.print(c[i][j])
#      System.out.print("\n")

p02903().main()