package buoi5;

public class DogTest {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setSize(-1);
        dog.setName("Thanh Huong") ;
        dog.setBreed("USA");
        
        System.out.println("Name: "+dog.getName());
        System.out.println("Breed: "+dog.getBreed());
        System.out.println("Size of dog: "+dog.getSize());
    }
    
}
