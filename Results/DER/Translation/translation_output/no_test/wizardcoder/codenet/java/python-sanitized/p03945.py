import java.util.*;

public class p03945:
  def main(args):
    sc = Scanner(System.in)
    s = sc.next()
    sc.close()
    str = [s[i:i+1] for i in range(len(s))]
    counter = 0
    for i in range(len(str)-1):
      if str[i]!= str[i+1]:
        counter += 1
    System.out.println(counter)