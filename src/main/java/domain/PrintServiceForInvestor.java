package domain;

public class PrintServiceForInvestor implements PrintService {
    @Override
    public void print(Person[] peoples) {
        System.out.println("Размер списка: " + peoples.length);
        for (int i = 0; i < peoples.length; i++) {
            Person person = peoples[i];
            System.out.println("Имя " + person.getName()
                    + "; Возраст " + person.getAge()
                    + "; Телефон " + person.getPhoneNumber());
        }
        System.out.println();
    }
    @Override
    public void print(Customer[] customers){
            System.out.println("Размер списка покупателей: " + customers.length);
            for (int i = 0; i < customers.length; i++) {
                Customer customer = customers[i];
                System.out.println("Имя " + customer.getName()
                        + "; Возраст " + customer.getAge()
                        + "; Телефон " + customer.getPhoneNumber()
                        + "; Номер карты " + customer.getCardNumber());
            }
        System.out.println();
    }

    @Override
    public void print(Gamer[] gamers) {
        System.out.println("Размер списка геймеров: " + gamers.length);
        for (int i = 0; i < gamers.length; i++) {
            Gamer gamer = gamers[i];
            System.out.println("Имя " + gamer.getName()
                    + "; Возраст " + gamer.getAge()
                    + "; Телефон " + gamer.getPhoneNumber()
                    + "; Платформа " + gamer.getPlatform());
        }
        System.out.println();
    }
}
