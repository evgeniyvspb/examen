public class Donkey extends Animal {
    public Donkey(String animal, String ownerName) {
        this.nameAnimal = animal;
        this.ownerName = ownerName;     
    }
    
    public void run(Integer speed){
        System.out.println("Я умею бегать со скоростью" +  speed);
    }
}

