/*
Tarea 11
Estudiante: Erik Everardo Cavazos Hernández
Matrícula: 1811290
Clase: Lenguajes de Programación V4-V6 Jueves
Docente: Ismael Pimentel
*/
import javax.swing.JOptionPane;
public class tarea11{
    public static void main(String[]args){
        int n,i=1,j,pares=0,numeros=0;
        String letrero = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"numero"));
        //genera numeros de la serie hasta que se generen n-numeros
        while(numeros < n){
            //si el numero es impar, solo se concatena un "-" al principio
            if(i%2 != 0){
                letrero += "-" + i + ",";
                numeros++;
            }else{
                pares += 1;//se lleva una cuenta de pares

                //imprime el numero par tomando en cuenta cuantos pares se tienen,
                //se le aumenta 1
                for(j=1;j<=pares+1;j++){
                    letrero += i + ",";
                    numeros++;
                    if(numeros >= n){
                        j=pares+1;
                    }
                }


            }
            i++;
        }
        JOptionPane.showMessageDialog(null,letrero);
    }
}