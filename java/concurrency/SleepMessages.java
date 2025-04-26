package concurrency;

public class SleepMessages{

    public static void main(String[] args) throws InterruptedException{
        String[] sleepMessages = {
                "Sleep Well",
                "Good night",
                "Sleep dream"
        };
        // Pauses the main thread and prints a sleep message in every 4 secs
        for(String sleepMessage:sleepMessages){
            Thread.sleep(4000);
            System.out.println(sleepMessage);
        }
    }
}