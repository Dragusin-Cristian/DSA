import java.util.HashMap;

public class Problems {

    public static void execute(){
        System.out.println(Problems.checkUniqueChars("This"));
    };

//    1.1 Implement an algorithm to determine if a string has all unique characters. What if you
//    can not use additional data structures?
    static Boolean checkUniqueChars(String str) {
//        Integer strLength = str.length();
//        HashMap<Character, Boolean> map = new HashMap<>();
//        for(int i = 0; i< strLength; i++) {
//            Character character = str.charAt(i);
//            if(map.containsKey(character)) {
//                return false;
//            } else {
//                map.put(character, true);
//            }
//        }
//        return true;

//        SPACE OPTIMIZED + NO EXTRA DS:
        boolean[] chars = new boolean[256];
        for(int i = 0; i < str.length(); i++){
            if(chars[str.charAt(i)]) {
                return false;
            } else {
                chars[str.charAt(i)] = true;
            }
        }
        return true;
    }
}
