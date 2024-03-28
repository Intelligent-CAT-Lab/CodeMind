public class p03945 {
    public String translate(String s) {
        return (s.replace("WB", "BW").replace("BW", "WB")).length() + "BW";
    }
}