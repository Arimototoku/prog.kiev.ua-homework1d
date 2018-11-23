package ua.i.sonne;

public class Phone {

    private String model;
    private int number;

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
     * @param phone
     */
    public static void registerInNetwork(Phone phone){
        Network.addNewNumber(phone);
    }

    /**
     * Calling method. If number exist - calling, otherwise - number is not available
     * @param number
     */
    public void call(int number){

        System.out.println("\n" + this.getModel() + " says:\nTry to call to number " + number + "...");
        for (int i = 0; i < Network.getPhones().length; i++) {
            if (Network.getPhones()[i].getNumber() == number){
                System.out.println("Number is exist");
                Network.getPhones()[i].incomingCall();
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
