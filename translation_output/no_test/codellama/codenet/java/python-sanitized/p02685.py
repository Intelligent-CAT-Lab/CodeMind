import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.buf = bytearray(1024)
        self.curChar = 0
        self.numChars = -1
        self.filter = None
        self.br = BufferedReader(InputStreamReader(System.in))

    def read(self):
        if self.numChars == -1:
            raise InputMismatchException()

        if self.curChar >= self.numChars:
            self.curChar = 0
            try:
                self.numChars = self.stream.