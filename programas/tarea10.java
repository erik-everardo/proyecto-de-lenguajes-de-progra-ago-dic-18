/*
Tarea 10
Estudiante: Erik Everardo Cavazos Hernández
Matrícula: 1811290
Clase: Lenguajes de Programación V4-V6 Jueves
Docente: Ismael Pimentel
*/
import javax.swing.JOptionPane;
public class tarea10{
    public static void main(String[] args){
        String entrada,letrero="";
        int n,i;
        entrada = JOptionPane.showInputDialog(null,"Cantidad de numeros a generar: ");
        n = Integer.parseInt(entrada);
        for(i=1;i<n;i++){
            letrero += (int)Math.pow(i,((2*i)-1)) + ", ";
            System.out.println((2*1)-1);
        }
        letrero += (int)Math.pow(n,((2*n)-1)) + ".";
        
        JOptionPane.showMessageDialog(null,letrero);
    }
}