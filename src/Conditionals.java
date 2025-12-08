public class Conditionals {

    String question;
    public static void main(String[] args) {
        Conditionals MagicEightBall = new Conditionals();
    }

    public Conditionals(){
    question= "do you like pizza";
        System.out.println(question);
        int randomInt = (int)(Math.random()*11);

        if (randomInt<=2) {
            System.out.println("Absolutely Not");
        }
        else if (randomInt==3) {
            System.out.println("Very doubtful");
        }
        else if (randomInt==4){
            System.out.println("Highly Unlikely");

        }
        else if (randomInt==5){
            System.out.println("Better Late than never");

        }
        else if (randomInt==6) {
            System.out.println("Probable");

        }
        else if (randomInt==7){
            System.out.println("Better not say ");

        }
        else if (randomInt==8){
            System.out.println("Your luck decieves you");

        }
        else if (randomInt==9){
            System.out.println("I cannot say");

        }
       else if (randomInt==10){
            System.out.println("It is certain");

        }


    }





}
