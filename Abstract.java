abstract class Animal {
    protected int age;
    protected String name;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name:" + name + ", Age:" + age;
    }
}

class Cow extends Animal {
    private String tail;

    public Cow(String name, int age, String tail) {
        super(name, age);
        this.tail = tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getTail() {
        return tail;
    }

    public String toString() {
        return super.toString() + ", Tail:" + tail;
    }

}

class Dog extends Animal {
    private String ear;

    public Dog(String name, int age, String ear) {
        super(name, age);
        this.ear = ear;
    }

    public void setEar(String tail) {
        this.ear = ear;
    }

    public String getEar() {
        return ear;
    }

    public String toString() {
        return super.toString() + ", Ear:" + ear;
    }

}

class Run {
    public static void main(String[] args) {
        Animal animal;

        animal = new Dog("Ah lulu", 12, "short ear");
        printAnimalObject(animal);

        animal = new Cow("Ah Peal", 32, "long tail");
        printAnimalObject(animal);

    }

    private static void printAnimalObject(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("===================Dog object=================");
            System.out.println(animal.toString());
        } else {
            System.out.println("===================Cow object=================");
            System.out.println(animal.toString());
        }
        if(true){
            int ok = 32;

        }
        System.out.println(ok);

    }
}