package domain;

public class Main {

    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Sarah", 30, 112),
                new Person("John", 12, 113),
                new Person("Phil", 33, 114),
                new Person("Frank", 18, 115),
                new Person("Danny", 28, 116),
        };

        Customer[] customers = {
                new Customer("John", 12, 113, 111321),
                new Customer("Phil", 33, 114, 111322),
                new Customer("Frank", 18, 115, 111323),
        };

        Gamer[] gamers = {
                new Gamer("Sarah", 30, 112, "PlayStation"),
                new Gamer("Danny", 28, 116, "PC"),
        };

        PrintService printService = new PrintService();
        printService.print(peoples);
        printService.print(customers);
        printService.print(gamers);
    }
}

