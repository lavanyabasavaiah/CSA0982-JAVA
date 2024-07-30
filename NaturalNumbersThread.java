class NaturalNumbersThread extends Thread {
    int start;
    NaturalNumbersThread(int start) { this.start = start; }
    public void run() {
        for (int i = start; i < start + 5; i++) {
            System.out.println(i);
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
    public static void main(String[] args) {
        new NaturalNumbersThread(1).start();
        new NaturalNumbersThread(6).start();
        new NaturalNumbersThread(11).start();
    }
}
