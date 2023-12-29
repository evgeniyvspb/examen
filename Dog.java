public class Dog extends Animal{
    public Dog(String animal, String ownerName) {
        this.nameAnimal = animal;
        this.ownerName = ownerName;     
    }
    public void run(Integer speed) {
        System.out.println("I can run with a speed " + speed);
    }

        public void ill() {
        System.out.println("I am ill");
    }
}