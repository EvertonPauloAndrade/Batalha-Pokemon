package Poke;

import java.util.Random;

public class Batalha {
    // Aqui temos os atributos do tipo abstrato de dados "Pokemon"
    private Pokemon desafiado;
    private Pokemon desafiante;
    // Aqui temos um atributo do tipo booleano (para validar V ou F)
    private boolean ligaCerta;

    // Definição dos getters e setters
    public Pokemon getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Pokemon desafiado) {
        this.desafiado = desafiado;
    }

    public Pokemon getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Pokemon desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isLigaCerta() {
        return ligaCerta;
    }

    public void setLigaCerta(boolean ligaCerta) {
        this.ligaCerta = ligaCerta;
    }

    // Este método marca as batalhas
    // Não é possível haver uma batalha sem marcar
    // Os dois Pokémon precisam ser diferentes objetos
    // Os dois Pokémon precisam ter até 1500 de CP
    // Os dois Pokémon são do tipo "Pokemon", que é uma classe
    public void marcarBatalhaPequenaLiga(Pokemon p1, Pokemon p2) {
        if (p1.getCombatPower() > 1500 || p2.getCombatPower() > 1500 || p1 == p2) {
            System.out.println("A batalha não pode acontecer!!!");
            this.setLigaCerta(false);
        } else {
            System.out.println("A batalha pode acontecer!!!");
            this.setLigaCerta(true);
            this.setDesafiado(p1);
            this.setDesafiante(p2);
        }
    }

    public void marcarBatalhaGrandeLiga(Pokemon p1, Pokemon p2) {
        System.out.println("A batalha pode acontecer!!!");
        this.setLigaCerta(true);
        this.setDesafiado(p1);
        this.setDesafiante(p2);
    }

    // Este método faz com que dois pokémons batalhem,
    // recebendo como parâmetro os dois Pokémon
    public void batalhar(Pokemon desafiante, Pokemon desafiado) {
        if (!this.isLigaCerta()) {
            System.out.println("A batalha não pode acontecer!!!");
        } else {
            System.out.println("A batalha vai começar!!!");
            System.out.println("*******************************");
            System.out.println("Apresentando o desafiante!!!");
            this.desafiante.apresentar();
            System.out.println("Apresentando o desafiado!!!");
            this.desafiado.apresentar();

            Random valor = new Random();
            int decisaoBatalha = valor.nextInt(3);

            switch (decisaoBatalha) {
                case 0:
                    this.desafiante.ganharBatalha();
                    this.desafiado.perderBatalha();
                    System.out.println("Vitória do desafiante!!!");
                    break;
                case 1:
                    this.desafiante.perderBatalha();
                    this.desafiado.ganharBatalha();
                    System.out.println("Vitória do desafiado!!!");
                    break;
                case 2:
                    this.desafiante.empatarBatalha();
                    this.desafiado.empatarBatalha();
                    System.out.println("Empate!!!");
                    break;
            }
        }
    }
}
