import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileCSV {

    public static void main(String[] args) throws IOException {

        File file = new File("nation.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] nations = line.split(",");
            System.out.println(nations[5]);
        }
        fileReader.close();
    }

}
