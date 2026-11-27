public class Task_1 {

    public static void main(String[] args) {

        Product product = new Product(
                "Ноутбук",
                "2026-01-15",
                "Apple",
                "Китай",
                120000,
                false
        );

        product.printInfo();
    }
}

class Product {

    String name;
    String productionDate;
    String manufacturer;
    String country;
    int price;
    boolean isReserved;

    public Product(String name, String productionDate,
                   String manufacturer, String country,
                   int price, boolean isReserved) {

        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + isReserved);
    }
}
