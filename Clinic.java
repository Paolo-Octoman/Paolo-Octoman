import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("\n===== Pet Clinic Menu =====");
        System.out.println("1. Register a Dog");
        System.out.println("2. Register a Cat");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch(choice){
            case 1: pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepperd");
                System.out.println("\n--- Pet Record ---");
                System.out.println("Pet ID: " + petFile.getPetId());
                System.out.println("Pet name: " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("Breed: " + ((Dog) petFile.getPet()).getBreed());
                System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                break;
            case 2: pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                System.out.println("\n--- Pet Record ---");
                System.out.println("Pet ID: " + petFile.getPetId());
                System.out.println("Pet name: " + petFile.getPetName());
                System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
                System.out.println("No. of Lives: " + ((Cat) petFile.getPet()).getNoOfLives());
                System.out.println("Communication sound: "+ petFile.getPet().makeSound());
                System.out.println("Play mode: " + petFile.getPet().play());
                break;
            case 3:
                System.out.println("Thank you! Have a nice day!");
                System.exit(0);
                input.close();
                return;
            default:
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
        }

    }
}