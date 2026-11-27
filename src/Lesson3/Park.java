public class Park {

    class Attraction {
        String name;
        String workingHours;
        int price;

        Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 21:00", 700);
        Park.Attraction attraction3 = park.new Attraction("Комната страха", "12:00 - 20:00", 300);

        attraction1.displayInfo();
        attraction2.displayInfo();
        attraction3.displayInfo();
    }
}
