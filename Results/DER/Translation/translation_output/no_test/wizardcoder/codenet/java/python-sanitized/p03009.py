import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

class TaskE:
    def solve(self, testNumber: int, in: FastInput, out: FastOutput):
        n = in.readInt()
        h = in.readInt()
        d = in.readInt()
        mod = Number