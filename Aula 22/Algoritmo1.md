Function BuscaLinerar(A,n,x){

1. `	`i = 1
2. `	`Enquanto   i <= n       faça
3. `		`Se A[i]==  x     então
4. `			`Devolva i
5. `		`i = i + 1
6. `	`Devolva-1

Linhas:

L1 = 1 (inicialização de i)

L2 = Px vezes (quantidade de vezes que o loop é executado)

L3 = Px vezes (quantidade de vezes que a condição é verificada)

L4 = 1 (quando a condição é verdadeira, a função retorna)

L5 = Px vezes - 1 (a última verificação da condição é evitada após encontrar o valor)

L6 = 1 (quando a função não encontra o valor, retorna -1)



Respostas:

T(n) = t + tpx + 2tpx + 2t(px-1) + t = 5tpx

1ª posição= 5t

Última=5tn
