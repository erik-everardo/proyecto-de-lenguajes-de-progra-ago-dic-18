#Tarea 8
#Convertidor de temperaturas
#Nombre: Erik Everardo Cavazos Hernandez
#Matrícula: 1811290
#Clase: Lenguajes de programación V4-V6 Jueves
#Docente: Ismael Pimentel
puts "Quiere convertir:"
puts "1. Fahrenheit -> Celcius"
puts "2. Celcius -> Fahrenheit"
accion = gets().to_i
if accion == 1 then
    print "Ingrese grados Fahrenheit: "
    cantidad = gets().to_f
elsif accion == 2 then
    print "Ingrese grados Celcius: "
    cantidad = gets().to_f
else
    puts "Opcion incorrecta"
end
unless cantidad == nil then
    case accion
        when 1 then puts "#{(cantidad - 32) / 1.8} grados Celcius"
        when 2 then puts "#{(cantidad*1.8) + 32} grados Fahrenheit"
    end
end