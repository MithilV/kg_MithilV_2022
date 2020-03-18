import java.util.HashMap;

public class main{
    public static void main(String[] args){
        main obj = new main();
        System.out.println(obj.isOneToOne(args[0], args[1]));
    }

    public boolean isOneToOne(String first, String second){
        HashMap<Character,Character> one = new HashMap<>();
        HashMap<Character,Character> two = new HashMap<>();
        if(first.length() != second.length()){
            return false;
        }

        for(int i = 0; i < first.length(); i++){
            char char1 = first.charAt(i);
            char char2 = second.charAt(i);

        if(one.containsKey(char1)){
            if(char2 != one.get(char1)){
                return false;
            }
        }
        else{
            if(two.containsKey(char2)){
                return false;
            }

            one.put(char1, char2);
            two.put(char2, char1);
        }

    }
        return true;
}



}