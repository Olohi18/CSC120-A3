import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
class Conversation {

  public static void main(String[] arguments) {

  Scanner sc = new Scanner(System.in);
  Random rand = new Random();

  //Initializes random responses
  String resp[] = {"That sounds fun", "Tell me more", "Can you elaborate on that?", "How old are you?", "What?", "Pardon?"};
  List <String> response = Arrays.asList(resp);
  int length = response.size();

  System.out.println(length);  
  
    

  // System.out.println(response);
  //int index = response.get(rand.nextInt(response.charAt()));

  //Initializes game
  System.out.println("Enter number of rounds please");
  int rounds = sc.nextInt();
  sc.nextLine();

  //

  System.out.println("Hi there, what do you want to talk about?");
  for (int i = 1; i <= rounds; i++){
    String input = sc.nextLine();
    
    System.out.println(response.get(rand.nextInt(length)));
    }
  System.out.println("Goodbye. Thanks for talking to me");
  sc.close();

  }



  

} 


    // int x = response.get(rand.nextInt(length));

    // int randomElement = givenList.get(rand.nextInt(givenList.size()));