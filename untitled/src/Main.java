import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class Main {
    public static void main(String[] args) {

            Inflater inflater = new Inflater();
            try {
                byte[] output = new byte[1024];
                int decompressedSize = inflater.inflate(output, 0, output.length / 2);
                System.out.println("inflate(byte[] output, int off, int len) called. Decompressed size: " + decompressedSize);
            } catch (DataFormatException e) {
                e.printStackTrace();
            }
    }
}