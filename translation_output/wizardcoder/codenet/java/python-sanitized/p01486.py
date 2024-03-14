import java.util.*;
import java.lang.*;

class p01486:
    def main(self, args):
        sc = Scanner(System.in)
        S = sc.next()
        if self.saiki(S):
            print("Cat")
        else:
            print("Rabbit")

    def saiki(self, S):
        if S == "":
            return True
        if S[0]!='m':
            return False
        en = 1
        i = 1
        while i < len(S) and en!= 0:
            if S[i] =='m':
                en += 1
            elif S[i] == 'e':
                en -= 1
            i += 1
        if i == len(S):
            return False
        eindex = i
        mn = 1
        i += 1
        while i < len(S) and mn!= 0:
            if S[i] == 'e':
                mn += 1
            elif S[i] == 'w':
                mn -= 1
            i += 1
        if i!= len(S):
            return False
        return self.saiki(S[1:eindex-1]) and self.saiki(S[eindex:])