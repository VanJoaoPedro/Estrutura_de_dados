#Exercício 04

#Faça um programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

letra = 0
count = 0
is_consoate = []
letras = []

while count <5:
    letra = input("Digite uma letra: ")
    letras.append(letra)
    count += 1

for letra in letras:
    if letra != 'a' and letra != 'e' and letra != 'i' and letra != 'o' and letra != 'u':
        is_consoate.append(letra)
        
print("Qtd de consoantes :", len(is_consoate))
print("Consoantes :", is_consoate[0:])