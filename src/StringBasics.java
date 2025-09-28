public class StringBasics {
    public static void main(String[] args) {
        String s = "Akashdeep Thanda";
        char [] chars = s.toCharArray();
        int left = 0 , right = chars.length - 1;
        while(left < right){
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--]=temp;
        }
        System.out.println(new String(chars));
    }
}
