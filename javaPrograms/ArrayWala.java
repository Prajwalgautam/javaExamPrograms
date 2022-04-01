import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ArrayWala {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("new.txt");
        Scanner sc = new Scanner(inputStream);
        StringBuffer buffer = new StringBuffer();
        while(sc.hasNext()) {
         String line = sc.nextLine();
         if (line.contains("Kathmandu")) {
             System.out.println(line);
             buffer.append(" \n"+line);
        }
        System.out.println("Contents of the file: "+buffer);
        FileWriter fw = new FileWriter("op.txt");
        fw.write(buffer.toString());
        fw.flush();
        fw.close();
        System.out.println("File copied successfully.......");
     }
     sc.close();
   }
}
