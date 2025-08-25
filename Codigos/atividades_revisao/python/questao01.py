#Exercício 01
#Faça um programa que leia um vetor de 5 números inteiros e mostre-os.

vetor = []
count = 0
numero = 0

while count < 5:
    numero = int(input('Dgite o numero :'))
    vetor.append(numero)
    count += 1
    
for i in vetor:
    print("Numero :", i)