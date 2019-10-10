#Tarea 10
#Nombre: Erik Everardo Cavazos Hernandez
#Matrícula: 1811290
#Clase: Lenguajes de programación V4-V6 Jueves
#Docente: Ismael Pimentel
print "Cantidad de numeros a generar de la serie: "
n = gets().to_i
puts n
for i in 1...n
    print i**(2*i-1)
    print ", "
end
print n**(2*n-1)