/*
Tarea 12
Estudiante: Erik Everardo Cavazos Hernández
Matrícula: 1811290
Clase: Lenguajes de Programación V4-V6 Jueves
Docente: Ismael Pimentel
*/
import javax.swing.JOptionPane;
public class tarea12{
    public static void main(String[] args){
        int n,numeros=0,numeroVecesPares=1,imparActual=3,parActual=2,contadorPares=1,i,y;
        String letrero = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de numeros a generar de la serie"));
        while(numeros < n){
            for(y=1;y<=numeroVecesPares;y++){
                if(numeros>=n){
                    y=numeroVecesPares;
                }
                if(parActual%2==0 && n!=numeros){
                    letrero += parActual + " ";
                    numeros++;
                    parActual+=2;
                    contadorPares++;
                }
            }
            for (i=1;i<=3;i++){
                if(imparActual%2!=0 && n!=numeros){
                    letrero += "-" + imparActual + " ";
                    numeros++;
                    imparActual+=2;
                }
            }
            numeroVecesPares++;
        }
        JOptionPane.showMessageDialog(null,letrero);
    }
}