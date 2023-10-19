package ovh.johanpassion;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien gagnez vous par an ?");
        int salaireAnnuel = clavier.nextInt();
        if(salaireAnnuel>=30000){
            System.out.println("Depuis combien d'années travaillez vous ?");
            int anneeTravail = clavier.nextInt();
            if(anneeTravail>=2){
                System.out.println("Prêt accorder !");
            }else{
                System.out.println("Malheureusement vous ne travaillez pas depuis assez longtemps pour que l'on puisse vous accorder un prêt.");
            }
        }else{
            System.out.println("Malheureusement vous ne gagnez pas assez pour que l'on puisse vous accorder un prêt.");
        }
        clavier.close();
    }
    
}
