package step186;

abstract class Animal {
    abstract void bark();
}


 class Dog extends Animal{
     @Override
     public void bark() {
         System.out.println("Bow BoW");

     }
 }
    class Cat extends Animal{
        public void bark() {
            System.out.println("meow Meow");

        }
    }
   class AnimalRunner{
        public static void main(String[] args) {
            Animal [] animals = {new Dog(), new Cat()};
            for ( Animal anOb: animals) {
             anOb.bark();
            }
        }
    }
