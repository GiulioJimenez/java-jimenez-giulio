import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Esercizio {
    public static void main(String[] args) {
        System.out.println("Inserisci il nome");

        Scanner tastiera = new Scanner(System.in);
        String nome = tastiera.nextLine();

        String nomeFile = "nome.txt";
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(nomeFile);
        }catch (FileNotFoundException e) {
            System.out.println("Errore");
            System.exit(0);
        }
        pw.println(nome);
        pw.close();

        Scanner file = null;

        try {
            file = new Scanner(new File(nomeFile));
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Stampo il nome: ");
        System.out.println(file.nextLine());
    }
}
