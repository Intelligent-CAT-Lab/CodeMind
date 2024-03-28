class main:
    class FastScanner:
        def __init__(self):
            self.st = None
            self.reader = self._get_reader()
    
        def _get_reader(self):
            import sys
            import io
            return io.BufferedReader(io.InputStreamReader(sys.stdin))
    
        async def next(self):
            import io
            if self.st is None or not self.st.hasMoreElements():
                line = await self.reader.readLine()
                self.st = io.StringTokenizer(line)
            return self.st.nextToken()
    
        async def nextInt(self):
            return int(await self.next())
    
        async def nextLine(self):
            self.st = None
            return await self.reader.readLine()
    
        async def nextIntArr(self, n):
            return [await self.nextInt() for _ in range(n)]
    
        async def nextLongArr(self, n):
            return [await self.nextLong() for _ in range(n)]
    
        async def close(self):
            await self.reader.close()
    
    
    class p03079:
        async def solve(self):
            fs = FastScanner()
            a = await fs.nextInt()
            b = await fs.nextInt()
            c = await fs.nextInt()
    
            if a == b == c:
                print("Yes")
            else:
                print("No")
    
    
    if __name__ == "__main__":
        import asyncio
        loop = asyncio.get_event_loop()
        mainObj = p03079()
        try:
            loop.run_until_complete(mainObj.solve())
        finally:
            loop.close()