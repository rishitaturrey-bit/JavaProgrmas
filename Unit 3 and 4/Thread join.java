class JoinThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }

    public static void main(String[] args) {
        JoinThread t = new JoinThread();
        t.start();

        try {
            t.join(); // main thread waits
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main Thread Finished");
    }
}