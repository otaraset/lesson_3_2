public class Main {
    public static void main(String[] args) {
        double[] numbers = {5.0, -0.2, 18.6, -10.8, -7.2, 6.5, 22.1, 11.9, -1.2, 2.5, -20.4, -16.7, 13.6, -4.1, 25.6};
        int theAmount = 0;
        double quantity = 0;
        boolean theCorrecNumber = false;
        for (double elements:numbers
        ) {
            if (elements < 0){
                theCorrecNumber = true;

            }
            else if (elements > 0 && theCorrecNumber){
                quantity = quantity + elements;
                theAmount++;
                System.out.println(elements);

            }
        }
        System.out.println(quantity / theAmount);

    }
}