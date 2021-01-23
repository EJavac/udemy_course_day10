package step178;

public class PetRunner {
    public static void main(String[] args) {

        Pet pet = new Pet();
        Animal animal = new Animal();
        animal.setName("Reks");
        animal.setAge(2);
        animal.setColour("Grey");
        pet.groomPet();
       pet.barkDog();
       //animal.toString();
      animal.toString();
        System.out.println(pet.getName());
        System.out.println(pet.getAge());
        System.out.println(pet.getColour());





    }
}
