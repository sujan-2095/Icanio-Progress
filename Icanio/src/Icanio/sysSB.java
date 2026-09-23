package Icanio;

class sysSB {

    static StringBuilder sb = new StringBuilder();

    static void appendText(String text) {

        synchronized (sb) {
            sb.append(text);
            System.out.println(
                    Thread.currentThread().getName() +
                            " added: " + text
            );
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                appendText("Thread-1 ");
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                appendText("Thread-2 ");
            }
        }, "Thread-2");

        t2.start();
        t1.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("\nFinal String:");
        System.out.println(sb);
    }
}