package string;

public class StringDemo {

    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxTemp = summer ? 45 : 35;
        if (temperature >= 25 && temperature <= maxTemp){
            return true;
        }
        return false;
    }


}
