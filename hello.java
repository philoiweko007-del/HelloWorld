public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Vincent");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.print("I am scared of aliens");

        }
        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 95;
        if ((topscore > secondTopScore) && (topscore < 100)) {
            System.out.println("Greater than the second top score and it is less than 100");
        }
        if ((topscore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }
        int newvalue = 50;
        if (newvalue == 50) ;
        {
            System.out.println("This is an true");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
        String makeOfCar = "Volkswasgon";
        boolean isDomestic = makeOfCar == "volkswasgon" ? false : true;

        if (isDomestic) {
            System.out.println("This can be a domestic country");
        }
        String s = (isDomestic) ? "This car is Domestic" : "This car is not Domestic";
        System.out.println(s);

        double firstValue = 20.00;
        double secondValue = 80.00;
        double myValuesTotal = (firstValue + secondValue) * 100.00d;
        System.out.println("myValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
