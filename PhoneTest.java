package ua.i.sonne;

public class PhoneTest {

    public static void main(String[] args) {

        Network vodafone = new Network();

        Phone phone = new Phone("Huawei", 661622550, vodafone);
        Phone phone1 = new Phone("Samsung", 661622551, vodafone);
        Phone phone2 = new Phone("Alcatel", 661622552, vodafone);
        Phone phone3 = new Phone("Nokia", 661622553, vodafone);
        Phone phone4 = new Phone("Lenovo", 661622554, vodafone);

        phone.call(661622553);
        phone2.call(4554);
        phone3.call(661622550);

    }
}
