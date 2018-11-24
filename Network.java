package ua.i.sonne;

public class Network {

    private static Phone[] phones = new Phone[5];
    private static int index = 0;

    public Network (){
    }

    public Phone[] getPhones() {
        return phones;
    }

    /**
     * Method  add phone number in array
     * @param phone
     */
    public void addNewNumber (Phone phone){
        phones[index] = phone;
        index++;
    }

}






