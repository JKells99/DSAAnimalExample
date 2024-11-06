import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter {

    Queue<Animal> animals = new LinkedList<>();

    public AnimalShelter() {
        this.animals = new LinkedList<>();
    }

    public Queue<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Queue<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void printAnimal(){
        for(Animal animal : animals){
            if(animal instanceof Dog){
                System.out.println("Dog Name: " + animal.getName());
            } else if(animal instanceof Cat){
                System.out.println("Cat's Name: " + animal.getName());
            }

        }
    }

    public void adoptAnimal() {
        Animal oldestAnimal = animals.peek();
        animals.remove(oldestAnimal);

    }

    public void adoptSpecificAnimal(String name){
        animals.removeIf(animal -> animal.getName().equals(name));

    }

    public void adoptFirstCat(){
        for(Animal animal : animals){
            if(animal instanceof Cat){
                animals.remove(animal);
                break;

            }
        }

    }
}
