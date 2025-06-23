package level3;

public class Main {
    public static void main(String[] args) {
        Generic manager = new Generic();

        SmartPhone smartPhone = new SmartPhone("Pera", "Revel", 874.21);
        SmartPhone smartPhone1 = new SmartPhone("Caribe", "Space", 679.98);

        manager.usePhone(smartPhone);
        manager.useSmartphone(smartPhone1);

    }
}
