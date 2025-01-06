public class Main {
    public static void main(String[] args) throws InterruptedException {
        int h = 8;
        int m = 43;
        int s = 0;
        
        while (true) {
            System.out.printf("\r%02d:%02d:%02d", h, m, s);
            System.out.flush();
            Thread.sleep(1000);
            
            s = s + 1;
            
            if (s == 60) {
                s = 0;
                m = m + 1;
            }
            
            if (m == 60) {
                m = 0;
                h = h + 1;
            }
            
            if (h == 12) {
                h = 0;
            }
        }
    }
}
