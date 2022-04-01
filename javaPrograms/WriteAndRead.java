import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class WriteAndRead {
    public static void main(String args[])
    {
        try {
            FileOutputStream fout = new FileOutputStream("exam.txt");
            String s  = "Tei same program sano banako.";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            FileReader fr = new FileReader("exam.txt");
            FileWriter fw = new FileWriter("new.txt");
            String str = "";
            int i;
            while ((i = fr.read()) != -1) {
    
                str += (char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
            System.out.println("File reading and writing both done");
            }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}