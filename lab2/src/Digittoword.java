import java.util.HashMap;
import java.util.Map;
public class Digittoword {
    public static void digitWord(String n){
        Map<Character,String> digit = new HashMap<Character,String>(){{
            put('1',"one");
            put('2',"two");
            put('3',"three");
            put('4',"four");
            put('5',"five");
            put('6',"six");
            put('7',"seven");
            put('8',"eight");
            put('9',"nine");
            put('0',"zero");
            clear();
        }};

        for(char num :n.toCharArray()){
            System.out.println(digit.get(num));
        }
    }

    public static void main(String[] args) {
        String n = "134";
        digitWord(n);

    }

}
