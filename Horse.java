public class Horse extends Animal {
    public Horse(String animal, String ownerName) {
        this.nameAnimal = animal;
        this.ownerName = ownerName;     
    }
    
    public void eat(){
        System.out.println("Обожаю кушать травку на лугу. м-м-м-м");
    }
}
