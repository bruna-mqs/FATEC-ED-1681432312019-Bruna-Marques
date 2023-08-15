* Algoritmo 3 - Busca Binária:\*


1. Function BuscaBinaria(x){
1. esq = 1
1. dir = n
1. enquanto esq <= dir faca{
1. meio = ((esq + dir) / 2)
1. se A[meio] == x entao
1. devolve meio
1. senao se x > A[meio] entao
1. esq = meio + 1
1. senao
1. dir = meio - 1
1. }
1. devolve -1
1. }


* Instruções por linha:\*
1. Declaração da função - 1 instrução.
1. Inicialização de 'esq' - 1 instrução.
1. Inicialização de 'dir' - 1 instrução.
1. Início do loop 'enquanto' - 1 instrução.
1. Cálculo do 'meio' - 1 instrução.
1. Condição 'A[meio] == x' - 2 instruções (1 para a comparação, 1 para a verificação da condição).
1. Devolver 'meio' - 1 instrução.
1. Condição 'x > A[meio]' - 2 instruções (1 para a comparação, 1 para a verificação da condição).
1. Atualização de 'esq' - 1 instrução.
1. Bloco 'senao' - 1 instrução.
1. Atualização de 'dir' - 1 instrução.
1. Finalização do loop 'enquanto' - 1 instrução.
1. Devolver -1 - 1 instrução.
1. Finalização da função - 1 instrução.

* Total de instruções:* 14
