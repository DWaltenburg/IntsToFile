package IntsToFile.src.Pakke;

import java.io.*;

public class ReadFile {
    public String [] values;
    String path = "src/intFile.csv";
    BufferedReader in = new BufferedReader(new FileReader(path));
    String line ="";

    public ReadFile() throws FileNotFoundException {}

    public void Reader() throws IOException {
        while ((line = in.readLine()) != null){
            values = line.split(",");
        }
    }
}