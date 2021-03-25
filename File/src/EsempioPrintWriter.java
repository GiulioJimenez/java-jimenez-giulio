import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EsempioPrintWriter {
    public static void main(String[] args) {
        String nomeFile = "output.txt";
        PrintWriter pw = null;

        Scanner file = null;

        try {
            file = new Scanner(new File(nomeFile));
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(file.nextLine());

        /*
        try {
            pw = new PrintWriter(nomeFile);
        }catch (FileNotFoundException e) {
            System.out.println("Errore");
        }
        pw.println("Ciao");
        pw.close();*/
    }
}
