### Calcular idade em dias

# Boas vindas ao exercício calcular idade em dias

<details> <summary> <strong> Descrição </strong> </summary>
<br />
Usando maven, uma classe que contenha seu método `main` que leia o nome de uma pessoa usuária do console Java e mais três valores (anos, meses e dias).

Uma segunda classe Java que calcule a quantidade de dias de vida de uma pessoa.

Você deve chamar a classe de `Pessoa`. Essa classe deve conter um método chamado `calcularIdadeEmDias`, que recebe 3 argumentos do tipo `int`: anos, meses e dias. Esse método deve calcular e retornar a idade da pessoa usuária em dias, e esse retorno deve ser do tipo `int`. Em outras palavras:

1. a pessoa deve entrar com seu nome, sua idade atual em anos e a quantidade de meses e dias decorridos desde seu aniversário;
2. o método `calcularIdadeEmDias` deve calcular e retornar a idade da pessoa usuária em dias.

**Para simplificar os cáculos, foi desconsiderado anos bissextos, ou seja, cada ano tem 365 dias. Considerando também que todos os meses têm 30 dias.**

</details>

<br />

<details> <summary> <strong> Exemplos </strong> </summary>

### Exemplo 1
Supondo que minha entrada seja:
```bash
Qual é o seu nome?
Carla
Qual é sua idade em anos, meses e dias?
anos:
32
meses:
2
dias:
29
```
Aqui nós lemos as entradas da pessoa usuária, fizemos as devidas conversões, instanciamos a classe `Pessoa`, passamos a quantidade de anos, de meses e de dias para o método `calcularIdadeEmDias(32, 2, 29)`, e a saída da método `calcularIdadeEmDias(32, 2, 29)` deve ser `11769`. Ou seja, a saída final do programa deve ser similar a essa:
```bash
Qual é o seu nome?
Carla
Qual é sua idade em anos, meses e dias?
anos:
32
meses:
2
dias:
29
Olá Carla, sua idade em dias é 11769
```

### Exemplo 2
Nesse segundo exemplo, supondo que a entrada seja:
```bash
Qual é o seu nome?
Paulo
Qual é sua idade em anos, meses e dias?
anos:
31
meses:
2
dias:
29
```
Aqui nós lemos as entradas da pessoa usuária, fizemos as devidas conversões, instanciamos a classe Pessoa, passamos a quantidade de anos, de meses e de dias para o método `calcularIdadeEmDias(31, 2, 29)`, e a saída da método `calcularIdadeEmDias(31, 2, 29)` deve ser `11404`. Ou seja, a saída final do programa deve ser similar a essa:
```bash
Qual é o seu nome?
Paulo
Qual é sua idade em anos, meses e dias?
anos:
31
meses:
2
dias:
29
Olá Paulo, sua idade em dias é 11404
```

</details>
