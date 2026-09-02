import java.util.HashMap;

public class Problems {

    public static void execute(){
//        1.1
//        System.out.println(Problems.checkUniqueChars("This"));

//        1.2
        char[] chars = {'a', 'b', 'c', '\0'};
        System.out.println(reverseCString(chars));
    };


//    1.2 Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
//    five characters, including the null character.)
    static char[] reverseCString(char[] chars) {
        if(chars == null || chars.length == 0) return new char[0];
        int strLength = chars.length - 1;
        char[] res = new char[chars.length];
        for (int i = 0; i < strLength; i++) {
            res[i] = chars[strLength-i-1];
        }
        res[strLength] = chars[strLength];
        return res;



    }


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
