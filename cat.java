public class Cat extends Animal {
    
    public Cat(String animal, String ownerName) {
        this.nameAnimal = animal;
        this.ownerName = ownerName;     
    }

    private void wakeUp() {
        System.out.println("Кот проснулся");
    }

    private void findFood() {
        System.out.println("Кот нашел еду");
    }

    private void eat() {
        System.out.println("Кот поел");
    }

    private void sleep() {
        System.out.println("Кот уснул");
    }

    public void hunt() {

        wakeUp();
        findFood();
        eat();
        sleep();
    }

    public void run(Integer speed) {
        System.out.println("I can run with a speed " + speed);
    }

    public void ill() {
        System.out.println("I am ill");
    }

}