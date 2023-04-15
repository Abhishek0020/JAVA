class Animal{
    public void animalSound(){
        System.out.println("the animal makes sounds ...");
    }
}
class pig extends Animal{
    public void animalSound(){
        System.out.println("the pig says : wee wee");
    }
}
class dog extends Animal{
    public void animalSound(){
        System.out.println("the dog says : bow bow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a=new Animal();
        Animal p=new pig();
        Animal d=new dog();

        a.animalSound();
        p.animalSound();
        d.animalSound();

    }
}
