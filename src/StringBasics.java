public class StringBasics {
    public static String revereseString(String s) {
        // String s = "Akashdeep Thanda";
        char [] chars = s.toCharArray();
        int left = 0 , right = chars.length - 1;
        while(left < right){
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--]=temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "Hello";
        //Calling Two Pointer Reverse apporach
        System.out.println(revereseString(s));
        //Method to reverse String is reverseString(varibale);
        System.out.println("The String Hello after Reversing is " + revereseString(s));
        //Method to print the substring variable.subString(beiginIndex,endIndex);
        System.out.println("The SubString is " + s.substring(0,4));
        //Method to Concat the String with other string is variable.concat("String name");
        System.out.println("The String after Concat is " + s.concat(" World"));
    }


}
