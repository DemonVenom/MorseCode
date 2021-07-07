
import java.util.Scanner;



public class MorseCode {

    public MorseCode() {

        // Create new scanner object
        Scanner scnr = new Scanner(System.in);

        // Create menuInput integer variable and set to -1
        int menuInput = -1;

        // Create while statement that so long as menuInput variable is not 0...
        while (menuInput != 0) {

            // Print out menu message instructing them what to do
            System.out.print("\nType 0 to end program\nType 1 below for English to Morse Code\nType 2 for Morse Code to English\nType Selection Here and press [Enter]: ");

            // Scan user input and place input into menuInput variable
            menuInput = scnr.nextInt();

            // Create switch statement that when menuInput is...
            switch (menuInput) {
                case 1:
                    // ...1, call EnglishToMorse method
                    EnglishToMorse();
                    break;
                case 2:
                    // ...2, call MorseToEnglish method
                    MorseToEnglish();
                    break;
            }
        }

        // End program on a new line
        System.out.print("\n");

    }


    // Create method to translate english phrases into morse code

    private void EnglishToMorse() {

        // Create character array to store english letters
        char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?', ' '};

        // Create string array to store morse code letters (with their order associated with english identity)
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", " "};

        // Create new scanner object
        Scanner scnr = new Scanner(System.in);

        // Print message prompting them to input english phrase (with instructions)
        System.out.println("\nWelcome to the English to Morse Code Translator\nEnter an english word/phrase below that you would like to translate to Morse code\nEnter the text how you would normally write it in english\nMorse code output characters will be separated by spaces\nEnglish spaces will be outputted as three spaces\n===================================================================================");

        // Scan user input, translating it to lowercase, and placing it to the userInput variable
        String userInput = scnr.nextLine().toLowerCase();

        // Place userInput into character array with each letter into each column
        char[] chars = userInput.toCharArray();

        // Create empty output string variable
        String outputString = "";

        // Create for statement to iterate through each input character
        for (int i = 0; i < chars.length; i++){

            // Create for statement to iterate through each english letter character from database
            for (int j = 0; j < english.length; j++){

                // Under the condition that an english character is the same as an input character...
                if (english[j] == chars[i]){

                    // Add the morse code equivalent to the output string plus a space at the end
                    outputString = String.format("%s%s%s", outputString, morse[j], " ");
                }
            }
        }

        // Print out outputString
        System.out.println(outputString);
    }


    // Create method to translate morse code into english phrases

    private void MorseToEnglish() {

        // Create character array to store english letters
        char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?', ' '};

        // Create string array to store morse code letters (with their order associated with english identity)
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", ""};

        // Create new scanner object
        Scanner scnr = new Scanner(System.in);

        // Print message prompting them to input Morse code phrase (with instructions)
        System.out.println("\nWelcome to the Morse Code to English Translator\nEnter Morse code that you would like translate into English\nWhen entering Morse Code, place a space between encoded letters\nAlso, place 3 spaces between encoded words to simulate the keying pauses\n=============================================================================== ");

        // Scan user input, translating it to lowercase, and placing it to the userInput variable
        String userInput = scnr.nextLine().toLowerCase();

        // Place user input into string array with each Morse code encrypted character into each column
        String[] chars = userInput.split("\\s");

        // Create empty output string
        String outputString = "";

        // Create for statement to iterate through each input character
        for (int i = 0; i < chars.length; i++){

            // Create for statement to iterate through each Morse code character from database
            for (int j = 0; j < morse.length; j++){

                // Under the condition that an Morse code character is the same as an input character...
                if (morse[j].equals(chars[i])){

                    // Place english equivalent into output string
                    //outputString = outputString + english[j];
                    outputString = String.format("%s%c", outputString, english[j]);
                }
            }
        }

        // Print out outputString
        System.out.println(outputString);
    }



}
