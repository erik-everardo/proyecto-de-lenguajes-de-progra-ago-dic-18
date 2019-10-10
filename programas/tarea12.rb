#Tarea 12
#Nombre: Erik Everardo Cavazos Hernandez
#Matrícula: 1811290
#Clase: Lenguajes de programación V4-V6 Jueves
#Docente: Ismael Pimentel
print("Ingrese la cantidad de numeros deseados: ")
n = gets().to_i


contador_pares = 1
numeros = 0
par_actual = 2
impar_actual = 3
numero_veces_pares=1
while numeros < n
	for y in (1..numero_veces_pares)
		if numeros>=n then
			y=numero_veces_pares
		end
		if par_actual%2==0 && n!=numeros then
			print par_actual.to_s + " "
			numeros+=1
			par_actual+=2
			contador_pares+=1
		end
	end
	for i in (1..3)

		if impar_actual%2!=0 && n!=numeros then
			print "-"+impar_actual.to_s + " "
			numeros+=1
			impar_actual+=2
		end
	end
	numero_veces_pares+=1
end
