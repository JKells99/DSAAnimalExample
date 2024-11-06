public class Test {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        Dog dog = new Dog("Billy",3,"Black Lab");
        Dog dog2 = new Dog("Jim",4,"Black Lab");
        Dog dog3 = new Dog("Bruce",5,"Golden Lab");

        Cat cat = new Cat("Phyllis",6," Medium Hair");
        Cat cat1 = new Cat("Ruby",6," Medium Hair");

        animalShelter.addAnimal(dog);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(dog3);
        animalShelter.addAnimal(cat);
        animalShelter.addAnimal(cat1);

        animalShelter.printAnimal();

//        animalShelter.adoptAnimal();
//        animalShelter.adoptSpecificAnimal("Phyllis");
        animalShelter.adoptFirstCat();
        System.out.println();

        animalShelter.printAnimal();







    }
}
