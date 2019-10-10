#Tarea 9
#Convertidor de divisas
#Nombre: Erik Everardo Cavazos Hernandez
#Matrícula: 1811290
#Clase: Lenguajes de programación V4-V6 Jueves
#Docente: Ismael Pimentel
DOLAR = 0.050
EURO = 0.044
YEN = 5.65
DOLARHK = 0.39

begin
    puts "Convertir pesos a:"
    puts "1. Dolar"
    puts "2. Euro"
    puts "3. Yen Japones"
    puts "4. Dolar Hong Kong"
    print "=>"
    accion = gets().to_i
    print "Convertir: "
    entrada = gets().to_f
    case accion
    when 1 then 
        resultado = entrada * DOLAR
        puts "#{entrada} pesos es #{resultado} dolares"
    when 2 then 
        resultado = entrada * EURO
        puts "#{entrada} pesos es #{resultado} euros"
    when 3 then 
        resultado = entrada * YEN
        puts "#{entrada} pesos es #{resultado} yenes"
    when 4 then 
        resultado = entrada * DOLARHK
        puts "#{entrada} pesos es #{resultado} dolares de Hong Kong"
    else puts "Error"
    end
    print "Desea realizar otra conversión? (1. si 2. no): "
    si_no = gets()
end while si_no == 1