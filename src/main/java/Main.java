public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 105;
        double height = 1.78;
        double bodyMassIndex = service.calculate(weight,height);
        System.out.println("индекс массы тела равен: " + bodyMassIndex);
    }
}