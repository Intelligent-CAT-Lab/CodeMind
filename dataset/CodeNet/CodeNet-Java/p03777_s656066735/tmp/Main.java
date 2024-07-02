import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] peopleSpeaks = br.readLine().split(" ");
System.out.println("[INST]12;peopleSpeaks;br.readLine().split(' ');"+peopleSpeaks);
System.out.println("[INST]12;None;br.readLine();"+br.readLine());
            String atCoDeerSpeak = peopleSpeaks[0];
            String topCoDeerSpeak = peopleSpeaks[1];

            if (atCoDeerSpeak.equals(topCoDeerSpeak)) {
System.out.println("[INST]16;None;atCoDeerSpeak.equals(topCoDeerSpeak);"+atCoDeerSpeak.equals(topCoDeerSpeak));
                System.out.println("H");
            } else {
                System.out.println("D");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
System.out.println("[INST]24;None;System.exit(0);"+System.exit(0));
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
System.out.println("[INST]27;None;System.exit(0);"+System.exit(0));
        }
    }
}