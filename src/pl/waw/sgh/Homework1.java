package pl.waw.sgh;

//TASK: Please write code that verifies that a given String is a valid email address
//https://www.tutorialspoint.com/java/java_regular_expressions.htm
//http://www.samouczekprogramisty.pl/wyrazenia-regularne-w-jezyku-java/
//https://en.wikipedia.org/wiki/Email_address

//Here I import java.util.regex package that is used for pattern matching with regular expressions.
//A regular expression is a special sequence of characters that helps you match or find
//other strings or sets of strings, using a specialized syntax held in a pattern.
//They can be used to search, edit, or manipulate text and data.

import java.util.regex.Pattern;

//Program should start with "class" - obvious

class Homework1
{
    private static boolean isValid(String email)
    {
        //Here I define what mail is. Email "syntax" is defined in the link from Wikipedia which I provided on the top
        //of this program.
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        //we need to have a pattern object. Pattern.compile(emailRegex) compiles the signs from String emailRegex
        //and creates a pattern "emailRegex" that we will validate
        Pattern pattern = Pattern.compile(emailRegex);
        //If we won't have anything in the string, the program should return a statement
        //that our email isn't valid. Thus we use == null (to check) and return false
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args)
    {
        //HERE WE WRITE THE EMAIL WE WANT TO VALIDATE
        String email = "maciej.piotr.mucha@gmail.pl";
        //IF statement, because we need to know if the email is valid or not
        if (isValid(email))
            System.out.print("Yes, the email is valid");
        else
            System.out.print("No - check the email for errors!");
    }
}
