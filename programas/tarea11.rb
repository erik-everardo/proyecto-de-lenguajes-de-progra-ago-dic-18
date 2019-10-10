#Tarea 11
#Nombre: Erik Everardo Cavazos Hernandez
#Matrícula: 1811290
#Clase: Lenguajes de programación V4-V6 Jueves
#Docente: Ismael Pimentel
print "Cuantos numeros de la serie quiere?: "
n = gets().to_i
pares = 0
numeros = 0
i = 1
#genera numeros de la serie hasta n-numeros
while numeros < n
    #si el numero es impar, solo se concatena un "-" al principio
    if i%2 != 0 then
        print "-#{i} "
        numeros = numeros + 1
    else
        pares = pares + 1 #se lleva una cuenta de pares
        #imprime el numero par tomando en cuenta cuantos pares se tienen
        #se le aumenta 1
        for j in (1..(pares+1))
            print "#{i} "
            numeros = numeros + 1
            if numeros >= n then
                j = pares+1
            end
        end
    end
    i = i + 1
end