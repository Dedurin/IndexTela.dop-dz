public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myIndexBody = service.IndexBody(1.75, 80);
        String  BmiService = String.format("%.2f",+ myIndexBody);
        double wheight;



        System.out.println("Индекс массы тела (BMI),(ИМТ) =  : "  + BmiService);
    }
}