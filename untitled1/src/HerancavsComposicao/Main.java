package HerancavsComposicao;
public class Main {
    public static void main(String[] args) {
   Cachorro dog = new Cachorro();
   dog.latir();
   dog.comer();

   Cachorro cachorro = new Cachorro();
  cachorro.comer();
// cachorro.latir(); // ERRO: Método latir() não existe em Animal!

  if(cachorro instanceof Cachorro){
      Cachorro dog2 = cachorro;
      dog.latir(); // Funciona!
  }

    }
}