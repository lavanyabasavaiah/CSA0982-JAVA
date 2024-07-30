import java.io.*;
public class FileWordCount {
    public static void main(String[] args) throws IOException {
        try (BufferedReader r = new BufferedReader(new FileReader("example.txt"))) {
            int lines = 0, words = 0, chars = 0;
            for (String line; (line = r.readLine()) != null; lines++) {
                chars += line.length();
                words += line.split("\\s+").length;
            }
            System.out.println("Lines: " + lines + ", Words: " + words + ", Chars: " + chars);
        }
    }
}
