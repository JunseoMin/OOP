

public class WildCardDemo {
    public static void main(String[] args) {
        Double[] dnums = { 0.0,1.1,2.2,3.3,4.4};
        Stats<Double> dob = new Stats<Double>(dnums);

        Integer[] inums = {1,2,3,4,5};
        Stats<Integer>iob = new Stats<Integer>(inums);

        System.out.println((iob.issameAvg(dob)));

    }
}
