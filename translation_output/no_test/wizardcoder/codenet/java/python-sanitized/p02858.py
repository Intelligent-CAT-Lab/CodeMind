import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

class p02858:
    class TaskAdapter(Runnable):
        def run(self):
            inputStream = System.in
            outputStream = System.out
            in = FastInput(inputStream)
            out = FastOutput(outputStream)
            solver = FDISCOSMOS()
            solver.solve(1, in, out)
            out.close()

    class FDISCOSMOS:
        def solve(self, testNumber, in, out):
            h = in.readInt()
            w = in.readInt()
            t = in.readInt()

            hh = h // GCDs.gcd(h, t)
            ww = w // GCDs.gcd(w, t)

            mod = Modular(1e9 + 7)
            pow = Power(mod)
            way = 1
            way = mod.plus(way, mod.subtract(pow.pow(2, hh), 2))
            way = mod.plus(way, mod.subtract(pow.pow(2, ww), 2))
            way = mod.plus(way, pow.pow(2, GCDs.gcd(hh, ww)))

            powMod = mod.get