1. Esq = 1
1. Dir =  1
1. Enquanto Esq  <= Dir faça
1. Meio = (Esq + Dir) / 2
1. Se  A[Meio] == x      então
1. Devolve Meio
1. Senao se x>  A[meio]       então
1. Esq = meio + 1
1. Senao
1. Dir = meio + 1
1. Devolva -1

Linhas:

L1 = 1 (inicialização de Esq)

L2 = 1 (inicialização de Dir)

L3 = Px vezes (quantidade de vezes que o loop é executado)

L4 = Px vezes (quantidade de vezes que a média é calculada)

L5 = Px vezes (quantidade de vezes que a condição é verificada)

L6 = 1 (quando a condição é verdadeira, a função retorna)

L7 = (Px - 1) vezes (a última verificação da condição é evitada após encontrar o valor)

L8 = (Px - 1) vezes (a última verificação da condição é evitada após encontrar o valor)

L9 = (Px - 2) vezes

L10 = (Px - 2) vezes

L11 = 1 (quando a função não encontra o valor, retorna -1)

Respostas:

T(n) = t + t + tPx + 3tPx + 2tPx + 2t(Px - 1) + 2t(Px - 1) + 2t(Px - 2) + t = 12tPx - 5t

1ª posição: 7t

Última posição: 12tn - 5t
