public class Hello {
    public static void main(String[] args) {
        System.out.println("helloworld");
        
        // Keep the program running indefinitely
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE); // Sleep indefinitely
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
