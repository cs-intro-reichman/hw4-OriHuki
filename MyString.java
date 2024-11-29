public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String newString = "";
        
        for (int i = 0; i < str.length(); i++){
            char newChar = str.charAt(i);
            
            if (str.charAt(i) >= 'A' && str.charAt(i)<= 'Z') {
            newString = newString + (char)(newChar + 32);}

            else{
                newString = newString + str.charAt(i);}

        }

        return newString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str1.indexOf(str2) != -1) { //CHECKING IF STR1 IS IN STR2, IF SO - RETURN TRUE. 
            return true;}
        return false; }
}
