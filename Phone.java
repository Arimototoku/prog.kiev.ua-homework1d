package ua.i.sonne;

public class Phone {

    private String model;
    private int number;
    private Network network;

    public Phone() {
    }

    public Phone(String model, int number, Network network) {
        this.model = model;
        this.number = number;
        this.network = network;
        registerInNetwork(network);
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

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    /**
     * Method is registering phone in Network
     */
    public void registerInNetwork(Network network){
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
