package domain;

public class Main {

    public static void main(String[] args) {
        Person[] peoples = {
                new Person("Sarah", 30, 112),
                new Person("John", 12, 113),
                new Person("Phil", 33, 114),
                new Person("Frank", 18, 115),
        };

        Customer[] customers = {
                new Customer("John", 12, 213, 111321),
                new Customer("Phil", 33, 214, 111322),
                new Customer("Frank", 18, 215, 111323),
        };

        Gamer[] gamers = {
                new Gamer("Sarah", 20, 115, "PlayStation"),
                new Gamer("John", 12, 116, "Xbox"),
                new Gamer("Phil", 23, 117, "Nintendo"),
                new Gamer("Sarah", 18, 118, "PC"),

        };

        PrintService printService = new PrintService();
        printService.print(peoples);
        printService.print(customers);
        printService.print(gamers);
    }
}

