import java.util.*;

class p02723:
  def main(self):
    sc = Scanner(System.in)
    s = sc.next()
    
    if s.charAt(2) == s.charAt(3) and s.charAt(4) == s.charAt(5):
      print("Yes")
    else:
      print("No")