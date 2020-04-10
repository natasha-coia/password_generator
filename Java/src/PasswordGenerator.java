import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        String spec = "N";
        int length = 9;
        int chars = 3;
        if (spec == "Y") {chars = 4;}
        System.out.println(generatePassword(chars,length));

    }

    // <3

    public static String generatePassword(int chars, int length) {
        String password = "";
        for (int i = 0; i < length; i++) {
            password = password + generateChar(chars);
        }
        return password;
    }

    public static String generateChar(int chars) {
        String[][] lists = {{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
        {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},
        {"0","1","2","3","4","5","6","7","8","9"},{"!","£","$","%","&","*","#","?"}};
        Random r = new Random();
        String[] list = lists[r.nextInt(chars)];
        String chara = list[r.nextInt(list.length)];
        return chara;
    }
}