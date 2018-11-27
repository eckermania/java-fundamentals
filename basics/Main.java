import java.util.Random; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main (String[] args) {

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        System.out.println(flipNHeads(2));

        clock();

    }

    public static String pluralize(String a, int b){
        if (b == 0 || b >1){
            a = a + "s";
        }
        return a;
    }


    public static String flipNHeads(int n) {
        int count = 0;
        int inARow = 0;

        while(inARow != n) {
            int headsOrTails = new Random().nextInt(2);
            if (headsOrTails == 0){
                System.out.println("heads");
                inARow++;
            } else {
                System.out.println("tails");
                inARow = 0;
            }
            count++;
        }
    return "It took " + count + " flips to flip " + n + " heads in a row.";
    }

    public static String clock(){
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
        return "time";
}
}


