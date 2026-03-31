class Shared {
    int value;
    boolean flag = false;

    synchronized void produce(int v) {
        value = v;
        System.out.println("Produced: " + value);
        flag = true;
        notify();
    }

    synchronized void consume() {
        try {
            if (!flag)
                wait();
        } catch (InterruptedException e) {}

        System.out.println("Consumed: " + value);
        flag = false;
    }
}

class Producer extends Thread {
    Shared s;
    Producer(Shared s) { this.s = s; }

    public void run() {
        s.produce(100);
    }
}

class Consumer extends Thread {
    Shared s;
    Consumer(Shared s) { this.s = s; }

    public void run() {
        s.consume();
    }
}

class TestPC {
    public static void main(String[] args) {
        Shared s = new Shared();

        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        p.start();
        c.start();
    }
}
