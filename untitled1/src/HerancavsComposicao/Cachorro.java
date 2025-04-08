package HerancavsComposicao;

public class Cachorro extends Animal{
    void latir() {
        System.out.println("Cachorro está latindo.");
    }

    @Override
    void comer() {
        System.out.println("Cachorro come ração.");
    }
}