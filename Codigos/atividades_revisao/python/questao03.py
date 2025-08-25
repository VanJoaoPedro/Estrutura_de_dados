#Exercício 03
#Faça um programa que leia 4 notas, mostre as notas e a média na tela.

notas = []
media = 0
count = 0
soma = 0

while count < 4:
    numero = int(input('Digite a nota:'))
    notas.append(numero)
    count += 1
    
for nota in notas:
    print("Notas :", nota)
    soma += nota
media = soma/len(notas)
print("media :", media )