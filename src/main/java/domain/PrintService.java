package domain;

public class PrintService {
    public void print(Person[] peoples) {
        System.out.println("Размер списка: " + peoples.length);
        for (int i = 0; i < peoples.length; i++) {
            Person person = peoples[i];
            System.out.println("Имя " + person.getName()
                    + "; Возраст " + person.getAge()
                    + "; Телефон " + person.getPhoneNumber());
        }
    }
    public void print (Customer[]customers){
            System.out.println("Размер списка покупателей: " + customers.length);
            for (int i = 0; i < customers.length; i++) {
                Customer customer = customers[i];
                System.out.println("Имя " + customer.getName()
                        + "; Возраст " + customer.getAge()
                        + "; Телефон " + customer.getPhoneNumber()
                        + "; Номер карты " + customer.getCardNumber());
            }
        }

}
