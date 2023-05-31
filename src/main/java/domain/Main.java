package domain;

public class Main {

    public static void main(String[] args) {
//        Person[] peoples = {
//                new Person("Sarah", 30, 112),
//                new Person("John", 12, 113),
//                new Person("Phil", 33, 114),
//                new Person("Frank", 18, 115),
//                new Person("Danny", 28, 116),
//        };

        Customer[] customers = {
                new Customer("John", 12, 113, 111321),
                new Customer("Phil", 33, 114, 111322),
                new Customer("Frank", 18, 115, 111323),
        };

        Gamer[] gamers = {
                new Gamer("Sarah", 30, 112, "PlayStation"),
                new Gamer("Danny", 28, 116, "PC"),
        };

        PrintService printServiceForInvestor = new PrintServiceForInvestor();
        PrintService printServiceForEmployee = new PrintServiceForEmployee();

        Person[] peoples = new Person[gamers.length + customers.length];
        for (int i = 0; i < customers.length; i++) {
            peoples[i] = customers[i];
        }
        for (int i = 0; i < gamers.length; i++) {
            peoples[i + customers.length] = gamers[i];
        }

        printReport(printServiceForInvestor, customers, gamers, peoples);
        printReport(printServiceForEmployee, customers, gamers, peoples);
    }

    private static void printReport(PrintService printService, Customer[] customers, Gamer[] gamers, Person[] peoples) {
        printService.print(customers);
        printService.print(gamers);
        printService.print(peoples);
    }
}

