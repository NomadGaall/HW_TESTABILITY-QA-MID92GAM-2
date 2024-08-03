public class BmiService {
    public int calculate(int kg, double meter) {
        int bmi;
        bmi = (int) (kg / (meter * meter));
        return bmi;
        //ИМТ= вес (кг) / (рост * рост).
    }
}