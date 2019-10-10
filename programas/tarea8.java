/*
Tarea 8
Convertidor de temperaturas
Estudiante: Erik Everardo Cavazos Hernández
Matrícula: 1811290
Clase: Lenguajes de Programación V4-V6 Jueves
Docente: Ismael Pimentel
*/
import javax.swing.JOptionPane;
public class tarea8{
    public static void main(String[] args){
        String [] botones = {"Grados Fahrenheit","Grados Celcius"};

        float cantidad = Float.parseFloat(JOptionPane.showInputDialog(null, "Escriba cantidad inicial"));
        float resultado;
        int opcion = JOptionPane.showOptionDialog (
            null, 
            "Convertir a: ", 
            "Convertir a...", 
            JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            botones, 
            botones[0]);
        switch(opcion){
            case 0:
                resultado = (cantidad*1.8f) + 32;
                JOptionPane.showMessageDialog(null,resultado + " grados Fahrenheit");
                break;
            case 1:
                resultado = (cantidad-32)/1.8f;
                JOptionPane.showMessageDialog(null,resultado + " grados Celcius");
                break;
        }
    }
}