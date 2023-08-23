Function BuscaLinerarEmOrdem(A,n,x)

1. i=1
2. enquanto   i <= n e x  >=  A[i]      faça
3.   SeA[i]== x       então
4.     Devolva i
5.   i =   i  +  1
6. Devolva -1


Linhas:

L1 = 1 (inicialização de i)

L2 = Px vezes (quantidade de vezes que o loop é executado)

L3 = Px vezes (quantidade de vezes que a condição é verificada)

L4 = 1 (quando a condição é verdadeira, a função retorna)

L5 = Px vezes - 1 (a última verificação da condição é evitada após encontrar o valor)

L6 = 1 (quando a função não encontra o valor, retorna -1)

Respostas:

T(n) = t + 4tPx + 2tPx + 2t (Px - 1) + t = 8tPx

1ª posição: 8t

Última posição: 8tn
