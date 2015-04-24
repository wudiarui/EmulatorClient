import java.util.Random;

/**
 * Created by jerry on 15-4-24.
 */
public class EmulatorClient {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CacthThread(), "Thread-A");
        Thread t2 = new Thread(new CacthThread(), "Thread-B");

        System.out.println("<<---------------------------------------->>");
        System.out.println("Waiting for synchronized threads 100");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.start();
        t2.start();
//        Random r1 = new Random(3);
//        //CacthThread[] ct = new CacthThread[100];
//        for(int i = 0; i < 100; i++) {
//            ct[i] = new CacthThread();
//            ct[i].setGroupId((short)(Math.abs(r1.nextInt(3)) + 1));
//            ct[i].setThreadName("DCS_POINT" + i);
//            //while(true) {
//            ct[i].run();
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//           // }
//        }
    }
}
