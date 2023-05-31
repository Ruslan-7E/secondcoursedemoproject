package domain;

public interface PrintService {
    default void print(Person[] peoples){
        System.out.println("Такой отчет смотреть не положено");
    }

    void print(Customer[] customers);

    void print(Gamer[] gamers);
}
