package IntsToFile.src.Pakke;
import java.io.*;

public class CreateFile {

    File file = new File("src/output.txt");
    FileWriter writer = new FileWriter(file);

    public CreateFile() throws IOException {}

    public void Creator(String[] number, int[] amount) throws IOException {
        file.createNewFile();
        for (int i = 1; i <amount.length; i++)
            writer.write(number[i] + " : " + amount[i] + '\n');
        writer.flush();
        writer.close();
        System.out.println("Filen findes under /src som 'output.txt'");
    }
}
