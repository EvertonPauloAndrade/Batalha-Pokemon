package Poke;

public class Main {
    public class BatalhaAvancad {

        public static void main(String[] args) {
          //Criação do vetor de Pokémon com 6 pokémon que serão intanciados
          Pokemon poke[] = new Pokemon[6];
          //Intanciamento de um pokémon, passando como parâmetros (O que existe dentrodos parênteses) os dados que o construtor exige;
          poke[0] = new Pokemon("Wigglytuff", "Kanto",
          "Normal/Fada", 1450,"Charme","Hiper raio");
         
          poke[1] = new Pokemon("Pikachu", "Kanto", "Elétrico",
          2500, "Ataque Rapido", "Choque do trovao");
         
          poke[2] = new Pokemon ("Torterra", "Sinnoh", "Planta/Terra",
          4000, "Folha Navalha", "Terremoto");
         
          poke[3] = new Pokemon("Blaziken", "Hoen", "Fogo/Lutador",
          4000, "Chute", "Superaquecimento");
         
          poke[4] = new Pokemon ("Golduck", "Kanto", "Agua/Psiquico",1200,
          "Raio de Gelo", "Ataque psiquico");
         
          poke[5] = new Pokemon("Gengar", "Kanto", "Fantasma/Venenoso",
          1100, "Onda de lama", "Pulso Obscuro");
         
          //criando um objeto do tipo Batalha para colocar
          //os nossos pokémon para batalhar
          Batalha batalha01 = new Batalha();
         
          //Aqui eu estou marcando uma batalha entre dois pokémon
          batalha01.marcarBatalhaPequenaLiga(poke[0], poke[4]);
         //Aqui estou fazendo meus pokémons batalharem
          batalha01.batalhar(poke[0], poke[4]);
         
          //Abaixo estou repetindo o processo diversas vezez
          batalha01.marcarBatalhaPequenaLiga(poke[0], poke[4]);
          batalha01.batalhar(poke[0], poke[4]);
          batalha01.marcarBatalhaGrandeLiga(poke[5], poke[2]);
          batalha01.batalhar(poke[5], poke[2]);
         
          /*batalha01.marcarBatalhaPequenaLiga(poke[0], poke[4]);
          batalha01.batalhar(poke[0], poke[4]);
          batalha01.marcarBatalhaPequenaLiga(poke[0], poke[4]);
          batalha01.batalhar(poke[0], poke[4]);*/
     
        }
       
    }
    
    
    
}
