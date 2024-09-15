public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static boolean palindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();

            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float getShortestpath(String path){
        int x =0; y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //south
        }
    }

    public static void main(String[] args) {
        // // Concatenate
        // String firstname = "Amit";
        // String lastname = "Chauhan";
        // String fullname = firstname + " " + lastname;

        // // Print letters
        // printLetters(fullname);
        String str = "racecar";
        System.out.println(palindrome(str));
    }
}
