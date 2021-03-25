import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci il tuo giorno");
        int giorno = tastiera.nextInt();
        System.out.println("Inserisci il tuo mese");
        int mese = tastiera.nextInt();
        int maxGiorni = 0;

        if (mese == 11 || mese == 4 || mese == 6 || mese == 9) {
            maxGiorni = 30;
        }
        if (mese == 2) {
            maxGiorni = 29;
        }

        if (mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12) {
            maxGiorni = 31;
        }

        if (giorno < 1 || giorno > maxGiorni) {
            System.out.println("Scelta non valida!");
        }else {
            switch(mese) {
                case 1:
                    if(giorno < 22) {
                        System.out.println("CAPRICORNO");
                    }else {
                        System.out.println("ACQUARIO");
                    }
                    break;
                case 2:
                    if(giorno < 20) {
                        System.out.println("ACQUARIO");
                    }else {
                        System.out.println("PESCI");
                    }
                    break;
                case 3:
                    if(giorno < 21) {
                        System.out.println("PESCI");
                    }else {
                        System.out.println("ACQUARIO");
                    }
                    break;
                case 4:
                    if(giorno < 21) {
                        System.out.println("ARIETE");
                    }else {
                        System.out.println("TORO");
                    }
                    break;
                case 5:
                    if(giorno < 22) {
                        System.out.println("TORO");
                    }else {
                        System.out.println("GEMELLI");
                    }
                    break;
                case 6:
                    if(giorno < 22) {
                        System.out.println("GEMELLI");
                    }else {
                        System.out.println("CANCRO");
                    }
                    break;
                case 7:
                    if(giorno < 23) {
                        System.out.println("CANCRO");
                    }else {
                        System.out.println("LEONE");
                    }
                    break;
                case 8:
                    if(giorno < 23) {
                        System.out.println("LEONE");
                    }else {
                        System.out.println("VERGINE");
                    }
                    break;
                case 9:
                    if(giorno < 23) {
                        System.out.println("VERGINE");
                    }else {
                        System.out.println("BILANCIA");
                    }
                    break;
                case 10:
                    if(giorno < 23) {
                        System.out.println("BIALNCIA");
                    }else {
                        System.out.println("SCORPIONE");
                    }
                    break;
                case 11:
                    if(giorno < 22) {
                        System.out.println("SCORPIONE");
                    }else {
                        System.out.println("SAGITTARIO");
                    }
                    break;
                case 12:
                    if(giorno < 22) {
                        System.out.println("SAGITTARIO");
                    }else {
                        System.out.println("CAPRICORNO");
                    }
                    break;
            }
        }


    }
}
