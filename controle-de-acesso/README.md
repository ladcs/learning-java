### Controle de acesso

# Boas vindas ao exercício Controle de acesso

<details> <summary> <strong> Descrição </strong> </summary>
<br />
Usando maven, acabou sendo feito um sistema de controle de acesso inteligente para um estabelecimento.
O  sistema, ao ser finalizado, deve apresentar um relatório que divida as pessoas que acessaram o estabelecimento em três categorias:

1. Pessoas menores de 18 anos,
2. Pessoas adultas (entre 18 e 49 anos), e
3. Pessoas a partir de 50 anos.

Com esse relatório, o cliente poderá tomar decisões baseadas em informações para alcançar ou fidelizar sua clientela. Esse sistema deve apresentar um menu, no console, indicando a opção de acessar o estabelecimento e a opção de finalizar o sistema e mostrar um relatório.

Para tal tem a classe Principal com os métodos:

`main`: que há um loop que se encerra quando option != 1, chama o método viewMenu e pega o valor recebido, em seguida recebe o novo valor para option, podendo ser  1 ou 2. Caso option == 1, pega a idade do cliente, então adiciona em um ArrayList a idade e envia para o relatório a idade, quando option for igual a 2 encerra o loop, imprimi quantos estão nas faixas e as porcentagens.

`viewMenu`: imprimi o menu, com a seguintes opções:

"Entre com o número correspondente à opção desejada:"
"1 - Acessar o estabelecimento"
"2 - Finalizar sistema e mostrar relatório"

`optionInMenu`: recebe o valor das opções dadas anteriormente, se for alguma coisa diferente de 1 ou 2 imprimi:

"Entre com uma opção válida"

e retorna chamando novamente o método.

`questAge`: começa imprimindo

"Entre com a sua idade:"

se o número for maior que 0, retorna idade, caso contrário. Imprimi:

"idade inválida, tente novamente"

e então retorna chamando o método novamente.

</details>


<br />
<details> <summary> <strong> Exemplos </strong> </summary>

Um exemplo da saída do relatório, considerando que 173 pessoas visitaram o estabelecimento, das quais 34 eram menores de 18 anos, 108 eram adultas entre 18 e 49 anos de idade, e 31 tinham a partir de 50 anos:
```
----- Quantidade -----
menores: 34
adultas: 108
a partir de 50: 31

----- Percentual -----
menores: 19.65%
adultas: 62.43%
a partir de 50: 17.92%

TOTAL: 173
```

</details>
