import java.util.Random;

public class dice {

    //Create our template for how to make dice.

    //Declare the properties.
    int numberOfSides;
    boolean isFair = true;
    char[] sides;

    Random r = new Random();

    //Declare the methods
    char roll(){

            int index = r.nextInt(numberOfSides);

            return sides[index];

    }




    //Constructor - a special method that makes new dice.
    dice(int numberOfSides, char[] sides){

        //Use arguments to set the values for your properties.
        this.numberOfSides = numberOfSides;
        this.sides = sides;

    }


}
