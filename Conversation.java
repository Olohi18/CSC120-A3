//Imports the necessary module from the JAVA class
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

class Conversation {

 
/** Primarily initiates the conversation with the user
 * @param takes in arguments from the user after short greeting message
 * @return Chatbot's response
 */ 
  public static void main(String[] arguments) {

  //Initializes the Scanner and random variables
  Scanner sc = new Scanner(System.in);
  Random rand = new Random();

  //Assigns the canned responses as a list to a variable and sets its length to a vaiable "length." 
  String resp[] = {"That sounds fun", "Tell me more", "Can you elaborate on that?", "You are so smart to think in such depth", "Is there something else I can help with?", "Any more?", "All possible", "Thanks", "How old are you?", "What?", "Pardon?"};
  List <String> cannedResponse = Arrays.asList(resp);
  int length = cannedResponse.size();

  //Initializes a variable transcript to store the transcript of the conversation in form of an array
  List <String> transcript = new ArrayList<String>();

  //Asks the user to enter number of rounds and set that to a variable "rounds"
  System.out.println("Enter number of rounds please");
  int rounds = sc.nextInt();
  sc.nextLine();

  //Initialized Chatbot's automatic greeting messages
  String welcome = ("Hi there, what do you want to talk about?"); 
  String goodbye = ("Goodbye. Thanks for talking to me");


  //The chatbot starts!!!! Time to play
  System.out.println(welcome);
  transcript.add(welcome);
 
  for (int i = 1; i <= rounds; i++)  //Runs the conversation until requested number of rounds is reached
    {String response = ""; 
    String input = sc.nextLine().toLowerCase();
    transcript.add(input);

    //Checks if input has any of the a set of words to be mirrored
    if (input.contains("i ")
       |input.contains("are")
       |input.contains("me ")
       |input.contains("am ")
       |input.contains("you ")
       |input.contains("my ")
       |input.contains("your ")){

        String[] words = input.split("\\s+" );
        //mirrors the required words
        for (String word: words){
            if (word.equals("i"))
                {word = "you";}
            else if (word.equals("me"))
                {word = "you";}
            else if (word.equals("am"))
                {word = "are";}
            else if (word.equals("you"))
                {word = "I";}
            else if (word.equals("my"))
                {word = "your";}
            else if (word.equals("your"))
                {word = "my";}
            else if (word.equals("are"))
                {word = "am";}
            else if (word.equals("?"))
                {word = "";}
            // else if (word.contains("?")) //Was wondering how to delete ? from user's original response so it doesn't appear twice in the Chatbot's response
            //     {word.replace("?", "");}

            response += word + " ";}

        //Adds the Chatbot's response to a transcript
        transcript.add(response + "?");
        System.out.println(response + "?");
          }
            
    //runs if no mirrored word is found
    else{
      String randomResponse;
      randomResponse = cannedResponse.get(rand.nextInt(length - 1));
      transcript.add(randomResponse);
      System.out.println(randomResponse);
  }
  
    }

  //prints the goodbye message
  System.out.println(goodbye);
  transcript.add(goodbye);
  
  //prints the transcript
  System.out.println();
  System.out.println("It's nice talking with you. Here is the transcript of our conversation: ");
  System.out.println();  
  for (String element: transcript){
    System.out.println();
    System.out.println(element);
  }
  sc.close(); //closes the scanner

}
 }
  





  