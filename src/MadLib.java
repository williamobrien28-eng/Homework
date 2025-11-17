public class MadLib {
    public int wholeNumberBetween1And4;
    public String classmate;
    public String pluralNoun;
    public String city;
    public double decimalBiggerThan1;
    public String miltonTeacher;
    public String miltonDean;
    public char letterGrade;
    public double number1;
    public double number2;
    public String adjective;
    public String noun;
    public String pluralAnimal;
    public boolean trueOrFalse;
    public String season;

    public static void main(String[] args) {
        System.out.println("Hello world");
        MadLib myStory= new MadLib();
    }
    public MadLib (){
        wholeNumberBetween1And4 =2;
        classmate = "Will";
        pluralAnimal = "Horses";
        pluralNoun = "Houses";
        city = "Boston";
        decimalBiggerThan1 = 1.1;
        miltonTeacher = "Mx Bradford";
        miltonDean = "Ms Sugrue";
        letterGrade = 'A';
        number1 = 7.2;
        number2 = 11;
        adjective = "Smart";
        noun = "Cone";
        trueOrFalse = false;
        season = "Winter";


        System.out.println("Hello Varld");
        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);


    }
}
