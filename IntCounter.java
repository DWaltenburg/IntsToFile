package IntsToFile.src.Pakke;
import java.io.*;

public class IntCounter {


    static int search(String[] arr, String s) {
        int counter = 0;
        for (String value : arr) {
            if (s.equals(value)){
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) throws IOException {
        String[] query = new String[21];
        int[] result = new int[21];
        ReadFile In = new ReadFile();
        CreateFile Out = new CreateFile();

        In.Reader();

        for (int i = 0; i < 21; i++) {
            query[i] = Integer.toString(i);
        }

        for (int i = 0; i < query.length; i++) {
            result[i] = search(In.values, query[i]);
        }

        Out.Creator(query,result);
    }
}