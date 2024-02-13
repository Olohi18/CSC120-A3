import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
class Conversation {

  public static void main(String[] arguments) {

  Scanner sc = new Scanner(System.in);
  Random rand = new Random();
  String process;

  //Initializes random responses
  String resp[] = {"That sounds fun", "Tell me more", "Can you elaborate on that?", "How old are you?", "What?", "Pardon?"};
  List <String> candid_response = Arrays.asList(resp);
  int length = candid_response.size();

  //Defines the list variable
  List <String> transcript = new ArrayList<String>();
  //System.out.println(transcript);  
  
    

  // System.out.println(response);
  //int index = response.get(rand.nextInt(response.charAt()));

  //Initializes game
  System.out.println("Enter number of rounds please");
  int rounds = sc.nextInt();
  sc.nextLine();

  //
  String Welcome = ("Hi there, what do you want to talk about?"); // initiaize greeeting when done
  String Goodbye = ("Goodbye. Thanks for talking to me");


  System.out.println(Welcome);
  transcript.add(Welcome);

  for (int i = 1; i <= rounds; i++)
    {String response = "";
    String input = sc.nextLine();
    transcript.add(input);
    //input = " " + input.toLowerCase() + " ";
   //System.out.println(input);

    if (input.contains("I ")
       |input.contains("me ")
       |input.contains("am ")
       |input.contains("you ")
       |input.contains("my ")
       |input.contains("your ")){

        String[] words = input.split("\\s+" );
        for (String word: words){
            if (word.equals("I"))
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

            response += word + " ";}
        System.out.println(response);
          }
            

    else{
      String random_response;
      random_response = candid_response.get(rand.nextInt(length - 1));
      transcript.add(random_response);
      System.out.println(random_response);
  }
  
    }


  System.out.println(Goodbye);
  transcript.add(Goodbye);

  System.out.println();
  System.out.println("It's nice talking with you. Here is the transcript of our conversation: ");
  System.out.println();

  for (String element: transcript){
    System.out.println(element);
  }
  sc.close(); 

}
 }
  





  


    // int x = response.get(rand.nextInt(length));

    // int randomElement = givenList.get(rand.nextInt(givenList.size()));