package ua.i.sonne;

public class Phone {

    private String model;
    private int number;
    private Network network = new Network();

    public Phone() {
    }

    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Method is registering phone in Network
     */
    public void registerInNetwork(){
        network.addNewNumber(this);
    }

    /**
     * Calling method. If number exist - calling, otherwise - number is not available
     * @param number
     */
    public void call(int number){

        System.out.println("\n" + this.getModel() + " says:\nTry to call to number " + number + "...");
        for (int i = 0; i < network.getPhones().length; i++) {
            if (network.getPhones()[i].getNumber() == number){
                System.out.println("Number is exist");
                network.getPhones()[i].incomingCall();
                return;
            }
        }
        System.out.println("Number " + number + " is not available");
    }

    /**
     * Method for incoming call
     */
    public void incomingCall(){
        System.out.println("\n" + this.getModel() + " says:");
        System.out.println("Somebody is calling...");
    }
}
