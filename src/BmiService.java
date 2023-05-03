public class BmiService {
    public double IndexBody( double height,double wheight) {
        double myIndex;
        myIndex = wheight / (height * height);
        return myIndex;


    }
}