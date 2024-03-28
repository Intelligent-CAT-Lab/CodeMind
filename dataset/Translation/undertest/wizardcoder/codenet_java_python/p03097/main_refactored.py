class main:
    import java.io.*;
    import java.util.*;
    
    class ContestReader:
        def __init__(self, in_stream):
            self.reader = BufferedReader(InputStreamReader(in_stream))
            self.tokenizer = None
        
        def next(self):
            while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                try:
                    self.tokenizer = StringTokenizer(self.reader.readLine())
                except Exception as e:
                    raise RuntimeException(e)
            return self.tokenizer.nextToken()
        
        def nextInt(self):
            return int(self.next())
        
        def nextLong(self):
            return long(self.next())
        
        def nextDouble(self):
            return float(self.next())
        
        def next(self, n):
            array = []
            for i in range(n):
                array.append(self.next())
            return array
        
        def nextInt(self, n):
            array = []
            for i in range(n):
                array.append(self.nextInt())
            return array
        
        def nextLong(self, n):
            array = []
            for i in range(n):
                array.append(self.nextLong())
            return array
        
        def nextDouble(self, n):
            array = []
            for i in range(n):
                array.append(self.nextDouble())
            return array
        
        def nextCharArray(self):
            return self.next().toCharArray()
        
        def nextInt(self, n, m):
            matrix = []
            for i in range(n):
                row = []
                for j in range(m):
                    row.append(self.nextInt())
                matrix.append(row)
            return matrix
        
        def nextLong(self, n, m):
            matrix = []
            for i in range(n):
                row = []
                for j in range(m):
                    row.append(self.nextLong())
                matrix.append(row)
            return matrix
        
        def nextDouble(self, n, m):
            matrix = []
            for i in range(n):
                row = []
                for j in range(m):
                    row.append(self.nextDouble())
                matrix.append(row)
            return matrix
        
        def nextCharArray(self, n):
            matrix = []
            for i in range(n):