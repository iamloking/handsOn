package concurrency;


public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread! ~ HelloRunnable");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }

}
