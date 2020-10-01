import java.io.*;
import java.util.Scanner;

public class CopyFileText {

    public static void main(String[] args) {

        try {
            FileReader fileReader;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao tap tin nguon : ");
            String source = scanner.nextLine();
            File fileSource = new File(source);
            if (fileSource.canRead()){
                fileReader = new FileReader(fileSource);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                System.out.println("Nhap vao tap tin dich : ");
                String target = scanner.nextLine();
                File fileTarget = new File(target);
                if (fileTarget.createNewFile()){
                    FileWriter writer = new FileWriter(target);
                    String line;
                    int totalChar = 0;
                    while ((line = bufferedReader.readLine()) != null){
                        writer.write(line + "\n");
                        totalChar+= line.length();
                    }
                    writer.close();
                    bufferedReader.close();
                    System.out.println("So ky tu la" + totalChar);
                }else {
                    System.out.println("File da ton tai");
                }
            }else {
                System.out.println("Khong tim thay file");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
