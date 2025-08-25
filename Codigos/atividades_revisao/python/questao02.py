#Exercício 02

#Faça um programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
count = 0
numero = 0
vetor = []

while count <10:
    numero = int(input('Digite o numero:'))
    vetor.append(numero)
    count += 1
    
print(vetor[::-1])