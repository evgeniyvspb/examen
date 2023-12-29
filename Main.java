import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> Animales = new ArrayList<Animal>(10);
        String animal; // тип животного
        String animalname; //имя животного
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do:  1 - add animal  2 - what it can? 3 - exit");
        Integer numb = scanner.nextInt();        
        while (numb!=3){          
            switch (numb) {
                case  1:
                    animal = scanner.nextLine();
                    System.out.println("Who is it?");
//                  animal = scanner.nextLine();
                    animal = scanner.nextLine();
                    // System.out.println("Write the type");
                    System.out.println("What is it name?");
                    animalname = scanner.nextLine();
                    switch (animal) {
                        case "cat":
                            Cat cat = new Cat(animalname, "zoo");
                            Animales.add(cat); 
                            break;
                        case "dog":
                            Dog dog = new Dog(animalname, "zoo");
                            Animales.add(dog);                             
                            break;
                        case "donkey":
                            Donkey donkey = new Donkey(animalname, "zoo");
                            Animales.add(donkey);                             
                            break;
                        case "horse":
                            Horse horse = new Horse(animalname, "zoo");
                            Animales.add(horse);                             
                            break;    
                        default:
                            System.out.println("such animals not at out zoo");
                            break;
                    }
                    break;
                case 2:
                    animal = scanner.nextLine();
                    System.out.println("Who is it?");
                    animal = scanner.nextLine();
                    //System.out.println("What is it name?");
                    //animalname = scanner.nextLine();
                    switch (animal) {
                        case "cat":
                            Cat cat = new Cat("", "zoo");
                            cat.hunt(); 
                            break;
                        case "dog":
                            Dog dog = new Dog("", "zoo");
                            dog.run(30);                             
                            break;
                        case "donkey":
                            Donkey donkey = new Donkey("", "zoo");
                            donkey.run(30);                            
                            break;
                        case "horse":
                            Horse horse = new Horse("", "zoo");
                            horse.eat();                             
                            break;    
                        default:
                            System.out.println("such animals not at out zoo");
                            break;
                    }
                    break;
                default:
                    System.out.println("такое выбрать нельзя");
                    break;
            }
            System.out.println("What do you want to do:  1 - add animal  2 - what it can?  3 - exit ");
            numb = scanner.nextInt();
        }
        scanner.close();
    }
}
