package concurrency;

public class HelloThread extends Thread{

    public void run(){
        System.out.println("Hello from a thread! ~ HelloThread");
    }
    public static void main(String args[]) {
        (new HelloThread()).start();
    }
}