
import java.util.Scanner;
import java.util.Locale;
import java.lang.String;

public class BMICal {
    static Scanner input = new Scanner(System.in);
    static int unitType;
    static boolean validInput ;
    static double height, weight, bmi;
    static char answer, answer1, answer2;
    static int age;
    static char gender;
    static double tbw, bmr; //total body water
    static String name, surname;
    static String bmiCat;

    public static void main(String [] args) {
        System.out.println("Enter your name:  ");
        name=input.nextLine();

        System.out.println("Enter your Surname:  ");
        surname=input.next();

        //BMI Programs
        bmiProgram();

        //Total body water
        tbwProgram();
        
        //Basal mR
        BasalMR();

        //Summary
        summary();

    
        

    }
    
    public static void BasalMR(){
        System.out.println("Basal Metabolic Rate — it's the number of calories your body needs at rest just to perform basic life functions.");

        do{
            System.out.println("Do you want to calculate your Basal Metabolic Rate? ");
            answer1=input.next().charAt(0);

            if(answer1 == 'y' ||  answer1 == 'Y'){
                System.out.println("Please note that the system uses the recent/ last results");
                System.out.println("latest age: " + age);
                System.out.println("latest weight: " + weight);
                System.out.println("latest Height: " + height);
                System.out.println("");

                System.out.println("Are you male or female: F or M ");
                gender = input.next().charAt(0);

                if(gender == 'f' || gender == 'f'){
                    bmr = 10 * weight + 6.25 * height - 5 * age -161;
                    System.out.println("Your Basal Metabolic Rate is:  "+ String.format("%.2f",bmr));

                }
                else{
                    bmr= 10*weight + 6.25 * height -5 * age +5;
                    System.out.println("Your Basal Metabolic Rate is:  "+ String.format("%.2f",bmr));
                }

            }else{
                break;
            }
            System.out.println("Do you want to run the Basal Metabolic program again?");
            answer1= input.next().charAt(0);

            if(answer1 == 'n' ||  answer1 == 'N'){
                break;
            }

        }while(answer1 == 'y' ||  answer1 == 'Y');
    }
    public static void summary(){
        System.out.println("Do you want a summary of your data: 1.y or 2.n ");
        answer1 =input.next().charAt(0);

        if(answer1 == 'y' ||  answer1 == 'Y'){
            System.out.println("Summary of your data: ");
            System.out.println("Your name and Surname: "+ name.replace(name.substring(0,1),name.substring(0,1).toUpperCase()) + "  " + surname.replace(surname.substring(0,1),surname.substring(0,1).toUpperCase()));
            System.out.println(" ");
            System.out.println("Your gender: " + gender);
            System.out.println(" ");
            if(gender == 'm' || gender == 'M'){
                System.out.println("Your age: "+ age);
            }
            System.out.println(" ");
            if(unitType == 1 ){
                System.out.println("The Metric(Kilograms & meters) unit system was used: ");

            }
            else{
                System.out.println("The Imperial(pounds & inches) unit system was used:");
            }

            System.out.println("Your weight: " + weight +  " Your height:" + height );
            System.out.println("Your current bmi: "+ String.format("%.2f",bmi) + " which you are: " + bmiCat );
            System.out.println(" ");
            System.out.println("Your Total body weight: "+ String.format("%.2f",tbw));
            System.out.println(" ");
            System.out.println("Thank you!!");

        }
    }
    public static void tbwProgram(){
        System.out.println("Total Body Water (TBW) is the total amount of water found in all the spaces of your body");
        do{

            System.out.println("Do you want to calculate your total body water? ");
            answer1=input.next().charAt(0);

            if(answer1 == 'y' ||  answer1 == 'Y'){
                System.out.println("Please note that the system uses the recent/ last results");
                System.out.println("latest weight: " + weight);
                System.out.println("latest Height: " + height);
                System.out.println("");

                System.out.println("Are you male or female: F or M ");
                gender = input.next().charAt(0);

                System.out.println("Enter your age: ");
                age = input.nextInt();

                if(gender == 'm' || gender == 'M'){

                    tbw = 2.447 + (0.3362 * weight) + (0.1074 * height) - (0.09516 * age);
                    System.out.println("Your total body water "+ String.format("%.2f",tbw));

                }
                else{
                    tbw = -2.097 + (0.2466 * weight) + (0.1069 * height);
                    System.out.println("Your total body water "+ String.format("%.2f",tbw));
                }

            }else{
                break;
            }
            System.out.println("Do you want to run the Body water program again?");
            answer= input.next().charAt(0);

            if(answer1 == 'n' ||  answer1 == 'N'){
                break;
            }

        }while(answer1 == 'y' ||  answer1 == 'Y');
    }

    public static void bmiProgram(){
        do{
            do{
                System.out.println("Please Choose the unit system you wanna use? \n\t 1.Metric(Kilograms & meters) \n\t 2.Imperial(pounds & inches)");
                unitType = input.nextInt();

                if(unitType == 1 || unitType == 2){
                    break;
                }

            }while(unitType != 1 || unitType != 2);

            do{
                System.out.println("Metric - Weight is within a realistic range (e.g., 10 to 600 kg or 10 to 1300 lbs) ");   
                System.out.println("Imperial - Height is within a realistic range (e.g., 0.5 to 5 meters or 20 to 100 inches)");

                System.out.println("Please enter your weight: ");
                weight = input.nextDouble();

                
                System.out.println("Please enter your height: ");
                height = input.nextDouble();

                validInput  = validationWeightHeight(height, weight, unitType);
                if(validInput == false){
                    System.out.println("Enter a realistic height or weight");
                }

                if(validInput == true){
                    break;
                }
                

            }while(validInput == false);

            System.out.println("Do you want to run the Program again?");
            answer= input.next().charAt(0);
                
            bmi=calculateBmi(weight,height,unitType);
            System.out.println("Your Bmi is :" + String.format("%.2f",bmi)+ " this means you are " + displayCategory(bmi)); 

            

            if(answer == 'n' ||  answer == 'N'){
                break;
            }
        }while(answer == 'y' ||  answer == 'Y');
    }

    public static boolean validationWeightHeight(double height,double weight, int unitChoice){
        boolean answer=false;

        if(unitChoice == 1)
        {
            if(weight>=10 && weight<=600 && height >= 0.5 && height <= 5){
                answer = true;
            }else{
                answer = false;
            }

        }
        else{

            if(weight >= 10 && weight <= 1300 && height >= 20 && height <= 100){
                answer= true;
            }else{
                answer = false;
            }
        }
        return answer;
    }

    public static double calculateBmi( double weight, double height, int unitChoice){
        double bmi;

        if(unitChoice == 1){
            bmi= weight/(height * height);
        }
        else{
            bmi= (703*weight)/(height* height);
        }

        return bmi;
    }

    public static String displayCategory(double bmi) {

        if( bmi < 16.0)
        {
            bmiCat ="Severely Underweight";
        }
        else if (bmi >= 16.0 && bmi <= 18.4) {
            bmiCat= "Underweight";
        }
        else if (bmi >= 18.5 && bmi <=24.9) {
            bmiCat= "Normal";
        }
        else if(bmi >= 25.0 && bmi>= 29.9) {
            bmiCat= "Overweight";
        }
        else if(bmi>= 30.0 && bmi>=34.9 ) {
            bmiCat = "Moderately Obese";
        }
        else if(bmi>= 35.5 && bmi <= 39.9) {
            bmiCat = "Severely Obese";
        }
        else{
            bmiCat= "Morbidly Obese";
        }

        return "Your bmi category is "+ bmiCat;
    }

    public static char askToRepeat(char answer ) {

        if(answer == 'y' ||  answer == 'Y'){
            answer = answer;
        }
        else{
            answer= answer;
        }
        return answer;
    }
}
