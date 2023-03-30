package aula12;

public class Aula12 {

    public static void main(String[] args) {
        //Animal a = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldfish = new GoldFish();
        Arara arara = new Arara();
        
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        
        tartaruga.locomover();
        canguru.locomover();
        
    }
    
}
