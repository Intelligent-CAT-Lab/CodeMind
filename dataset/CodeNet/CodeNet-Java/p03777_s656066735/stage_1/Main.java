import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

var newVariable_0 = br.readLine();            String[] peopleSpeaks = newVariable_0.split(" ");
            String atCoDeerSpeak = peopleSpeaks[0];
            String topCoDeerSpeak = peopleSpeaks[1];

var newVariable_1 = atCoDeerSpeak.equals(topCoDeerSpeak);            if (newVariable_1) {
                System.out.println("H");
            } else {
                System.out.println("D");
            }

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}