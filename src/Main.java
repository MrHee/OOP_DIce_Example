public class Main {


    public static void main(String[] args) {


//Construct a die
        dice firstDice = new dice(6, new char[] {'1','2','3','4','5','6'});


        dice secondDice = new dice(5, new char[] {'█','#','n','±', '☼'});


       //Test our die
        System.out.println("Roll the dice:");

        for (int i = 0; i <100 ; i++) {
            System.out.println(firstDice.roll());
        }

        System.out.println(secondDice.roll());









    }


}