/*
Tarea 9
Convertidor de monedas
Estudiante: Erik Everardo Cavazos Hernández
Matrícula: 1811290
Clase: Lenguajes de Programación V4-V6 Jueves
Docente: Ismael Pimentel
*/
import javax.swing.JOptionPane;

public class tarea9{
    public static void main(String[] args){
        //definicion de constantes (1 peso en...)
        final float dolar = 0.050f;
        final float euro = 0.044f;
        final float yen = 5.65f;
        final float dolarHK = 0.39f;

        //strings de botones
        String[] opciones = {"Dolar estadounidense", "Euro", "Yen (japones)", "Dolar HK"};
        String[] opcionesSalir = {"Si", "No"};
        float resultado;
        int salir;

        do{
            float entrada = Float.parseFloat(JOptionPane.showInputDialog(null,"Introducir valor en pesos mexicanos"));
            int accion = JOptionPane.showOptionDialog(
                null, 
                "Convertir " + entrada + " pesos a...", 
                "Convertir a", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]
                );
            switch(accion){
                case 0: 
                    resultado = entrada * dolar;
                    JOptionPane.showMessageDialog(null,entrada + " pesos equivale a " + resultado + " dolares");
                    historial.add(entrada + " pesos equivale a " + resultado + " dolares");
                    break;
                case 1: 
                    resultado = entrada * euro;
                    JOptionPane.showMessageDialog(null,entrada + " pesos equivale a " + resultado + " euros");
                    historial.add(entrada + " pesos equivale a " + resultado + " dolares");
                    break;
                case 2: 
                    resultado = entrada * yen;
                    JOptionPane.showMessageDialog(null,entrada + " pesos equivale a " + resultado + " yenes japonenes");
                    historial.add(entrada + " pesos equivale a " + resultado + " dolares");
                    break;
                case 3: 
                    resultado = entrada * dolarHK;
                    JOptionPane.showMessageDialog(null,entrada + " pesos equivale a " + resultado + " dolares de Hong Kong");
                    historial.add(entrada + " pesos equivale a " + resultado + " dolares");
                    break;
            }
            salir = JOptionPane.showOptionDialog(null,"Desea realizar otra conversion?", "Realizar otra operacion", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null, opcionesSalir,opcionesSalir[0]);
        }while(salir == 0);
    }
}