public class Task_2 {

    public static void main(String[] args) {

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product(
                "Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true
        );

        productsArray[1] = new Product(
                "iPhone 16", "15.09.2024",
                "Apple", "China", 7999, false
        );

        productsArray[2] = new Product(
                "Xiaomi 15", "20.01.2025",
                "Xiaomi", "China", 4999, true
        );

        productsArray[3] = new Product(
                "MacBook Air", "10.03.2025",
                "Apple", "China", 120000, false
        );

        productsArray[4] = new Product(
                "Sony PlayStation 5", "05.11.2024",
                "Sony", "Japan", 45000, true
        );

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
            System.out.println();
        }
    }
}
