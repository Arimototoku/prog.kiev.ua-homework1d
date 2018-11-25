package ua.i.sonne;

public class Network {

    private Phone[] phones = new Phone[5];
    private int index = 0;

    public Network() {
    }

    public Phone[] getPhones() {
        return phones;
    }

    /**
     * Method  add phone number in array
     *
     * @param phone
     */
    public void addNewNumber(Phone phone) {
        for (int i = 0; i < phones.length; i++) {
            if (phones[i] != null) {
                if (phones[i].getNumber() == phone.getNumber()) {
                    System.out.println("This number is registered already");
                    return;
                }
            } else {
                break;
            }
        }
        phones[index] = phone;
        index++;
    }

}






