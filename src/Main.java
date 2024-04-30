public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int myIndexBody = service.indexBody(1.87, 98);

        System.out.println();
        System.out.println("1,90 / 100");
        System.out.println(service.indexBody(1.90 ,100));



        System.out.println();
        System.out.println("2,00/ 100");
        System.out.println(service.indexBody(2.00,100));

        System.out.println();
        System.out.println("1,60/ 100");
        System.out.println(service.indexBody(1.60,100));







    }
}