package com.pszymczyk.exercises;

public class Excercise4 {

    /**
     * Wykonaj refaktoring Replace Method with Method Object (https://refactoring.guru/replace-method-with-method-object)
     * korzystając z narzędzi takich jak extract variable, extract method, change signature, move.
     *
     * Podczas ćwiczenia staraj się nie wykonywać żadnych operacji manualnie, cały czas pracuj na kompilującym się kodzie.
     * W celu sprawnego porusznia się między problemami wyłącz sprawdzanie pisowni Inspections -> Spelling
     *
     * 1. Stwórz klase ShowInfoService wewnątrz SomeUberService
     * 2. Dodaj parametr typu ShowInfoService do metody showInfo korzystając z okna Change Signature Cmd+F6 (Ctrl+F6 Windows/Linux)
     *    jako defaultową wartość podaj new ShowInfoService
     * 3. Przejdź do problemu nieużywanego parametru showInfoService korzystając z F2
     * 4. Przeczytaj komunikat problemu Cmd+F1 (Ctrl+F1 Windows/Linux)
     * 5. Przenieś metodę showInfo do ShowInfoService korzystając z move F6
     * 6. Znajdź wszystkie wykorzystania parametru postfix w metodzie showInfo Cmd+Shift+F7 (Ctrl+Shift+F7 Windows/Linux)
     * 7. Przejdź do odowłania do parametru postfix i przenieś parametr do pola klasy Cmd+Alt+F (Ctrl+Alt+F Windows/Linux)
     * 8. Usuń przypisanie do pola prefix w metodzie showInfo
     * 9. Korzystając z Extract Variable Cmd+Alt+V (Ctrl+Alt+V Windows/Linux) stwórz zmienną o nazwie prefix
     *    z inlinowego wywołania metody showInfo w metodzie test, skorzystaj z Cmd+P (Ctrl+P Windows/Linux)
     *    aby podejrzeć nazwy parametrów
     * 9. Przejdź do problemu niużywanego pola prefix w klasie ShowInfoService korzystając z F2
     * 10. Rozwiąż problem tworząc konstruktor Alt+Enter
     * 11. Przejdź do problemu nieużywanego parametru prefix w metodzie showInfo F2
     * 12. Bezpiecznie usuń nieużywany parametr Alt+Enter
     * 13. Postępuj tak samo z pozostałymi parametrami metody showInfo
     * 14. Jako ostatni krok przenieś ShowInfoService do osobnego pliku korzystając z polecenia move F6
     */

    public static void main(String[] args) {
        SomeUberService asd = new Excercise4().new SomeUberService("Beer", 500, 1000, 3.8);
        asd.test();
    }

    class SomeUberService {

        private final String name;
        private final long size;
        private final int quantity;
        private final double price;

        SomeUberService(String name, long size, int quantity, double price) {
            this.name = name;
            this.size = size;
            this.quantity = quantity;
            this.price = price;
        }

        public void test(){
            System.out.println(showInfo("<h1>", "</h1>", 10));
        }

        public String showInfo(String prefix, String postfix, int discountPercentages) {
            double afterDiscount = getAfterDiscount(discountPercentages);
            return addPrefix(prefix, addPostfix(postfix, name + " size: " + size + " price: " + afterDiscount + " available " + quantity));
        }

        private double getAfterDiscount(int discountPercentages) {
            int discountValue = discountPercentages / 100;
            return price * discountValue;
        }

        private String addPrefix(String prefix, String text) {
            return prefix + " " + text;
        }

        private String addPostfix(String postfix, String text) {
            return text + " " + postfix;
        }
    }
}
