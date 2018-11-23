package ua.i.sonne;

import java.util.ArrayList;

public class Network {

    private static Phone[] phones = new Phone[5];
    private static int index = 0;


     /**
     * Сделал конструктор приватным, чтобы нельзя было создавать экземпляры класса
     * Я думаю, они не нужны.
     */
    private Network (){
    }

    public static Phone[] getPhones() {
        return phones;
    }

    /**
     * Method  add phone number in ArrayList
     * @param phone
     */
    public static void addNewNumber (Phone phone){
        phones[index] = phone;
        index++;
    }

}






