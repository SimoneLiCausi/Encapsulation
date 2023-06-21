
public class House {

    // Achieve encapsulation using getters/setters for a class House that has the following instance variables:
    //an int floorsNumber
    //a string address
    //an array of strings residentsNames


    private int floorsNumber;
    private String address;
    private String[] residentsNames;


    // Creating set and get for floorsNumber
    int getFloorsNumber() {
        return floorsNumber;
    }

    void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }


    //Creating set and get for address;

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }


    //Creating set and get for residentsNames;

    String[] getResidentsNames() {
        return residentsNames;
     }

     void setResidentsNames(String residentsNames) {
        this.residentsNames = residentsNames.split(",");
     }





    }


