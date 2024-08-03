public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 98;
        double meter = 1.87;
        int index = service.calculate(kg, meter);
        System.out.println("Индекс массы тела равен: " + index);
    }
}