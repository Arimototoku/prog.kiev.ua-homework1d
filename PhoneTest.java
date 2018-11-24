package ua.i.sonne;

public class PhoneTest {

    public static void main(String[] args) {

        Phone phone = new Phone("Huawei", 661622550);
        Phone phone1 = new Phone("Samsung", 661622551);
        Phone phone2 = new Phone("Alcatel", 661622552);
        Phone phone3 = new Phone("Nokia", 661622553);
        Phone phone4 = new Phone("Lenovo", 661622554);
        phone.registerInNetwork();
        phone1.registerInNetwork();
        phone2.registerInNetwork();
        phone3.registerInNetwork();
        phone4.registerInNetwork();

        phone.call(661622553);
        phone2.call(4554);
        phone3.call(661622550);

    }
}
