public class Cat  extends Animal{


    String hairLength;

    public Cat(String name, int age, String hairLength) {
        super(name, age);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hairLength='" + hairLength + '\'' +
                '}';
    }
}
