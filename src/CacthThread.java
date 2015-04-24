import java.util.Random;

/**
 * Created by jerry on 15-4-24.
 */
public class CacthThread implements Runnable {
    private String threadName;
    private short groupId;
    private String[] equipments = {"DCS", "DEH", "ENV", "TNC", "HYD", "SIS"};

    private String getEquipment() {
        Random r = new Random();
        int i = r.nextInt(5) + 1;
        return equipments[i];
    }
    @Override
    public void run() {
        while(1 == 1) {
            Random r1 = new Random();
            Random r_unit = new Random();
            Random r_pkg = new Random();

            int inv = Math.abs(r1.nextInt(100) + 1);
            int pkgs = Math.abs(r_pkg.nextInt(500) + 1);
//        System.out.println(inv);
            StringBuffer outString = new StringBuffer(String.valueOf(inv)).append("# Thread");
            System.out.println(outString.append(" ").append("is from the unit ").append(r_unit.nextInt(3) + 1).append("#")
                    .append("[").append(this.getEquipment()).append("]").append(" receives datagrams： ")
                    .append(pkgs).append(" packages.").toString());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
