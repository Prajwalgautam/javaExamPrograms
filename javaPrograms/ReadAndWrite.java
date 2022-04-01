
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ReadAndWrite{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("new.txt");
        FileWriter fw = new FileWriter("out.txt");
        int c ;
        while((c=fr.read())!=-1){
            fw.write(c);
        }
        fr.close();
        fw.close();
    }
}
