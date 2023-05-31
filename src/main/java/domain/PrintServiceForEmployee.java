package domain;

public class PrintServiceForEmployee implements PrintService {
    @Override
    public void print(Person[] peoples) {
        System.out.println("Размер списка учтенных людей для сотрудников: " + peoples.length);
        System.out.println("Человек ");
        printPeople(peoples);
        System.out.println();
    }

    @Override
    public void print(Customer[] customers){
        System.out.println("Размер списка покупателей для сотрудников: " + customers.length);
        System.out.println("Покупатель ");
        printPeople(customers);
        System.out.println();
    }

    @Override
    public void print(Gamer[] gamers) {
        System.out.println("Размер списка геймеров для сотрудников: " + gamers.length);
        System.out.println("Геймер ");
        printPeople(gamers);
        System.out.println();
    }

    private void printPeople(Person[] peoples) {
        for (int i = 0; i < peoples.length; i++) {
            Person person = peoples[i];
            System.out.println("Имя " + person.getName()
                    + "; Возраст " + person.getAge()
                    + "; Телефон " + person.getPhoneNumber());
        }
    }
}
