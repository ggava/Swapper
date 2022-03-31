package classswapper;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Swapper troca = new Swapper();
        
        //obtendo valores
        System.out.print("x: ");
        troca.setX(Double.parseDouble(input.nextLine()));
        
        System.out.print("y: ");
        troca.setY(Double.parseDouble(input.nextLine()));
        
        //chamando o metodo para trocar os valores de lugar
        troca.swap(troca.getX(), troca.getY());
        
        //printando para confeir se houve a troca
        System.out.printf("VALORES TROCADOS!\n x: %.2f\n y: %.2f\n", troca.getX(), troca.getY());
    }
    
}
