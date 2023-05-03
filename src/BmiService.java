public class BmiService {
    public double calculate(double weight, double height) {
        double height1 = (height * height);
        double index = (weight / height1);
        return index;
    }
}