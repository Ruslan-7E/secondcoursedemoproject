package domain;

public class Main {

    public static void main(String[] args) {
        Person[] people = {
                new Person("Sarah", 30, 112),
                new Person("John", 12, 113),
        };
        System.out.println("Размер списка: " + people.length);
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя " + person.getName()
                    + "; Возраст "
                    + person.getAge()
                    + "; Телефон " + person.getPhoneNumber());
        }
    }

}
