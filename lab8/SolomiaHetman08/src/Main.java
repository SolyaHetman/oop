
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Command command = new Command();
        Scanner sc = new Scanner(System.in);

        String in;

        command.help();
        while(true){
            in = sc.next();
            switch(in.toLowerCase()){
                case "-start":
                    System.out.println("Enter string (if you finished press '-end'): ");
                    command.input();
                    break;

                case "-noalpha":
                    command.nonAplhabetic();
                    break;

                case "-vowel":
                    command.isvowel();
                    break;

                case "-consonant":
                    command.isconsonant();
                    break;
                case "-exit":
                    System.out.print("Program finished");
                    System.exit(0);
                    break;

                case "-help":
                    command.help();
                    break;

                case "-debug":
                    command.debug();
                    break;

                default:
                    System.out.println("Wrong command. Please type -help");
            }
        }
    }
}