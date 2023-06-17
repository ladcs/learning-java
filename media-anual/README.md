### Media anual

# Boas vindas ao exercício Media anual

<details> <summary> <strong> Descrição </strong> </summary>
<br />
Usando maven, há duas classes a primeira, main, tem o método main que recebe o nome, quatro notas e imprimi Olá, {nome}, sua média é {media dos 4 números}, o método nameInTerminal método responsável para receber o nome, o método numbersInTerminal serve para pegar os números, enquanto o método outputString serve para criar a string de saida do método main.

A segunda classe, Nota, há um único método no qual recebe 4 números, do tipo int, e retorna a média.
</details>

<br />
<details> <summary> <strong> Exemplos </strong> </summary>

#### Exemplo 1
Supondo que minha entrada seja:
```bash
Qual é o seu nome?
Carla
Entre com as notas das provas:
Avaliação 1:
9.85
Avaliação 2:
9.58
Avaliação 3:
9.90
Avaliação 4:
8.75
```
Aqui nós lemos as entradas da pessoa usuária, fizemos as devidas conversões, instanciamos a classe `Nota`, passamos as notas das avaliações para o método `calcularMedia(9.85, 9.58, 9.90, 8.75)`, e a saída da método `calcularMedia(9.85, 9.58, 9.90, 8.75)` deve ser `9.52`. Ou seja, a saída final do programa deve ser similar a essa:
```bash
Qual é o seu nome?
Carla
Entre com as notas das provas:
Prova 1:
9.85
Prova 2:
9.58
Prova 3:
9.90
Prova 4:
8.75
Olá, Carla, sua média é 9.52
```

#### Exemplo 2
Nesse segundo exemplo, supondo que a entrada seja:
```bash
Qual é o seu nome?
Paulo
Entre com as notas das avaliações:
Avaliação 1:
7.80
Avaliação 2:
6.5
Avaliação 3:
10.00
Avaliação 4:
8.75
```
Aqui nós lemos as entradas da pessoa usuária, fizemos as devidas conversões, instanciamos a classe `Nota`, passamos as notas das provas para o método `calcularMedia(7.80, 6.5, 10.00, 8.75)`, e a saída da método `calcularMedia(7.80, 6.5, 10.00, 8.75)` deve ser `8.2625`. Ou seja, a saída final do programa deve ser similar a essa:
```bash
Qual é o seu nome?
Paulo
Entre com as notas das avaliações:
Avaliação 1:
7.80
Avaliação 2:
6.5
Avaliação 3:
10.00
Avaliação 4:
8.75
Olá, Paulo, sua média é 8.2625
```

</details>