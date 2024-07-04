# Pokémon Battle Simulator

Este é um simulador de batalhas Pokémon desenvolvido em Java. O projeto permite criar batalhas entre diferentes Pokémon, com regras específicas para ligas pequenas e grandes. Cada Pokémon possui atributos como nome, região, tipo, poder de combate, ataques, e histórico de batalhas (vitórias, derrotas e empates).

## Estrutura do Projeto

O projeto é composto por três classes principais:

1. **Pokemon.java**: Define a classe `Pokemon` com seus atributos e métodos.
2. **Batalha.java**: Define a classe `Batalha`, responsável por gerenciar as batalhas entre os Pokémon.
3. **Main.java**: Classe principal que instancia Pokémon e simula batalhas.

## Classes e Métodos

### Pokemon.java

A classe `Pokemon` possui os seguintes atributos:

- `nome`
- `regiao`
- `tipo`
- `combatPower`
- `ataque`
- `ataqueEspecial`
- `numeroVitorias`
- `numeroDerrotas`
- `numeroEmpates`

Métodos principais:

- `apresentar()`: Apresenta os dados do Pokémon.
- `ganharBatalha()`: Atualiza as estatísticas do Pokémon ao vencer uma batalha.
- `perderBatalha()`: Atualiza as estatísticas do Pokémon ao perder uma batalha.
- `empatarBatalha()`: Atualiza as estatísticas do Pokémon ao empatar uma batalha.

### Batalha.java

A classe `Batalha` gerencia as batalhas entre os Pokémon. Possui os seguintes métodos principais:

- `marcarBatalhaPequenaLiga(Pokemon p1, Pokemon p2)`: Marca uma batalha para a liga pequena com restrições de CP.
- `marcarBatalhaGrandeLiga(Pokemon p1, Pokemon p2)`: Marca uma batalha para a liga grande sem restrições de CP.
- `batalhar(Pokemon desafiante, Pokemon desafiado)`: Realiza a batalha entre dois Pokémon, determinando o vencedor aleatoriamente.

### Main.java

A classe principal `Main` instancia Pokémon e simula batalhas:

```java
public class Main {
    public static void main(String[] args) {
        Pokemon poke[] = new Pokemon[6];
        poke[0] = new Pokemon("Wigglytuff", "Kanto", "Normal/Fada", 1450, "Charme", "Hiper raio");
        poke[1] = new Pokemon("Pikachu", "Kanto", "Elétrico", 2500, "Ataque Rapido", "Choque do trovao");
        poke[2] = new Pokemon ("Torterra", "Sinnoh", "Planta/Terra", 4000, "Folha Navalha", "Terremoto");
        poke[3] = new Pokemon("Blaziken", "Hoen", "Fogo/Lutador", 4000, "Chute", "Superaquecimento");
        poke[4] = new Pokemon ("Golduck", "Kanto", "Agua/Psiquico", 1200, "Raio de Gelo", "Ataque psiquico");
        poke[5] = new Pokemon("Gengar", "Kanto", "Fantasma/Venenoso", 1100, "Onda de lama", "Pulso Obscuro");

        Batalha batalha01 = new Batalha();
        batalha01.marcarBatalhaPequenaLiga(poke[0], poke[4]);
        batalha01.batalhar(poke[0], poke[4]);
        batalha01.marcarBatalhaPequenaLiga(poke[0], poke[4]);
        batalha01.batalhar(poke[0], poke[4]);
        batalha01.marcarBatalhaGrandeLiga(poke[5], poke[2]);
        batalha01.batalhar(poke[5], poke[2]);
    }
}
