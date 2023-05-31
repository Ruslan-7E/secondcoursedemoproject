package domain;

public class Main {

    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Sarah", 30, 112),
                new Person("John", 12, 113),
                new Person("Phil", 33, 114),
                new Person("Frank", 18, 115),
        };
        System.out.println("Размер списка: " + peoples.length);
        for (int i = 0; i < peoples.length; i++) {
            Person person = peoples[i];
            System.out.println("Имя " + person.getName()
                    + "; Возраст " + person.getAge()
                    + "; Телефон " + person.getPhoneNumber());
        }

        Customer[] customers = {
                new Customer("John", 12, 113, 111321),
                new Customer("Phil", 33, 114, 111322),
                new Customer("Frank", 18, 115, 111323),
        };
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
