import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class fail{
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("valjund.txt"));
        pw.println("test");
        pw.print("aaaa");
        pw.close();


    }
}