#Exercício 05

# Faça um programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
numeros = []
impar = []
par = []
i = 0
while i <5:
    numero = int(input("Digite um numero:"))
    numeros.append(numero)
    i += 1
    
for i in numeros:
    if (i % 2) == 0:
        par.append(i)
    else:
        impar.append(i)

print('Numeros Impares: ', impar)    
print('Numeros Pares: ', par)    