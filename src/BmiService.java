public class BmiService {
    public int indexBody(double height, int weight) {

        int indexBody = (int) (weight / (height * height));


            return indexBody ;
        }

}
