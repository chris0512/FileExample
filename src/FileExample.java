import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Dev\\Java\\CoreJava\\FileExample\\Test.txt");
            String str = "Learn Java Programming";

            byte b[] = str.getBytes();
            for(byte x: b)
                fos.write(x);

            fos.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
