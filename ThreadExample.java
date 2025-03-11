public class ThreadExample extends Thread{

    public ThreadExample(String name){
        super(name);
    }

    public void run(){
        System.out.println("Good bye manvendra singh & Best of luck for your bright future !");
    }

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample("My_Thread");
        System.out.println(threadExample.getName());
        //threadExample.run();
        // threadExample.setDaemon(true);
        // threadExample.start();

        threadExample.setName("Manvendra_2.0");
        System.out.println(threadExample.getName());
    }
}
