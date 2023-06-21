import java.util.Scanner;

public class Tester_Class {

    //use a tester class to:
    //set the values by asking the user to input them
    //for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
    //prints the house details using the getters and String.format()

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        House house1 = new House();




        System.out.println("Number of floors: ");

        int floors = scanner.nextInt();

        house1.setFloorsNumber(floors);





        System.out.println("Your address is: ");
        scanner.nextLine();
        String address = scanner.nextLine();
        house1.setAddress(address);






        System.out.println("Add the names (separated by a comma): ");

        String names = scanner.nextLine();
        house1.setResidentsNames(names);





        System.out.println("House details: ");
        System.out.println("Floors: " + house1.getFloorsNumber());
        System.out.println("Address: " + house1.getAddress());
        System.out.println("Names of residents: " + String.join(", " , house1.getResidentsNames()));


    }

}
