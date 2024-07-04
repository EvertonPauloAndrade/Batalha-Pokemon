package Poke;

public class Pokemon {
    // Definição dos atributos da classe
    // Pokémon, com suas visibilidades
    private String nome;
    private String regiao;
    private String tipo;
    private int combatPower;
    private String ataque;
    private String ataqueEspecial;
    private int numeroVitorias;
    private int numeroDerrotas;
    private int numeroEmpates;

    // Definição do construtor
    public Pokemon(String nome, String regiao,
                   String tipo, int combatPower,
                   String ataque, String ataqueEspecial) {
        this.nome = nome;
        this.regiao = regiao;
        this.tipo = tipo;
        this.combatPower = combatPower;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.numeroVitorias = 0;
        this.numeroDerrotas = 0;
        this.numeroEmpates = 0;
    }


    // Definição dos métodos especiais Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCombatPower() {
        return combatPower;
    }

    public void setCombatPower(int combatPower) {
        this.combatPower = combatPower;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(String ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getNumeroVitorias() {
        return numeroVitorias;
    }

    public void setNumeroVitorias(int numeroVitorias) {
        this.numeroVitorias = numeroVitorias;
    }

    public int getNumeroDerrotas() {
        return numeroDerrotas;
    }

    public void setNumeroDerrotas(int numeroDerrotas) {
        this.numeroDerrotas = numeroDerrotas;
    }

    public int getNumeroEmpates() {
        return numeroEmpates;
    }

    public void setNumeroEmpates(int numeroEmpates) {
        this.numeroEmpates = numeroEmpates;
    }


    // Criação do método "apresentar", que apresenta o Pokémon que vai participar da batalha
    public void apresentar() {
        System.out.println("++++++++++++++DADOS DA POKEDEX++++++++++++++ ");
        System.out.println("Nome do Pokemon: " + this.getNome());
        System.out.println("Regiao do Pokemon: " + this.getRegiao());
        System.out.println("Tipo do Pokemon: " + this.getTipo());
        System.out.println("CP: " + this.getCombatPower());
        System.out.println("Ataque: " + this.getAtaque());
        System.out.println("Ataque especial: " + this.getAtaqueEspecial());
        System.out.println("Este pokemon tem " + this.getNumeroVitorias()
                + " vitorias, " + this.getNumeroDerrotas()
                + " derrotas e " + this.getNumeroEmpates()
                + " empates ate entao!!!");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void atacar() {

    }

    public void ganharBatalha() {
        // aumenta a quantidade de vitórias em 1
        // this.numeroVitorias = numeroVitorias + 1;
        this.setNumeroVitorias(getNumeroVitorias() + 1);
        // this.combatPower = this.combatPower+5;
        this.setCombatPower(getCombatPower() + 500);
    }

    public void perderBatalha() {
        this.setNumeroDerrotas(getNumeroDerrotas() + 1);
    }

    public void empatarBatalha() {
        this.setNumeroEmpates(getNumeroEmpates() + 1);
    }

    public void aumentarCP() {
        this.setCombatPower(getCombatPower() + 1);
    }
}
