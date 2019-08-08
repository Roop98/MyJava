package ee.sdacademy;
import java.util.Scanner;
public class Fourthsugust6 {

    String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean returnword()
    {
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter a word:");
            word = scan.next();
            System.out.println(word);
            if (word.equalsIgnoreCase("continue"))
                continue;
            if (word.equalsIgnoreCase("quit"))
            {
                System.out.println("Goodbye");
                break;
            }
        }
        return true;
    }
}
