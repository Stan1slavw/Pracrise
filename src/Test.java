public class Test {
    public static void main(String[] args) {
        Thread chpok = new Thread(new Chpok());
        chpok.start();
         int a;
    }
}

class Chpok implements Runnable{
    @Override
    public void run() {
        System.out.println("pines");
    }
}
