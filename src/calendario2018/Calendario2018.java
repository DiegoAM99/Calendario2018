/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario2018;

/**
 *
 * @author Usuario
 */
public class Calendario2018 {
    public void ImprimeMes(int diaSemana, int n){
        int posicion = 1; //variable que guarda la posición del 1 al 7 en la que estamos
         n = n % 7; // si tengo más de 7, que imprima el numero correspondiente, que no haga otra linea de XX

        //imprime las XX iniciales
        for (int i = 0; i < n; i++) {
            System.out.print("XX ");
            posicion++;
        }

        //imprime los numeros del 01 al 31. Si posicion llega a 7, lo cambia a 0 e imprime una linea nueva
        for (int i = 1; i <= 31; i++) {
            if (i < 10) {
                System.out.print("0" + i + " ");
            } else {
                System.out.print(i + " ");
            }
            if ((i + n) % 7 == 0) {
                System.out.println();
                posicion = 0;
            }
            posicion++;
        }

        //imprime las XX del final
        for (int i = posicion; i <= 7; i++) {
            System.out.print("XX ");
        }
        //        for (int i=0; i<7 - (31+n)%7; i++){
        //    System.out.print("XX ");
        //} 
    }
    public static void main(String[] args) {
         Calendario2018 ejercicio1 = new Calendario2018();
         System.out.println(ejercicio1.ImprimeMes(0, 31));
        for (int i = 0; i <= 7; i++) {
           ejercicio1.ImprimeMes(i, i);
            System.out.println();
            System.out.println();
    }
    
    }
}
