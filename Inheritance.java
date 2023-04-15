public class Inheritance {
    public void soundAnimal() {
        System.out.println("the animal making sounds :");
    }
}
class inheritance extends dog {
    public void soundAnimal() {
        System.out.println(" the cat sounds is : mew mew");
    }
    public static void main(String[] args) {
        Animal a=new Animal();
        Animal p=new dog();
        p.animalSound();

    }
}