public class StringStr {
    public static void main(String[] args) {
        String name = "javatpoint";

        char ch = name.charAt(8);
        System.out.println("string: " + ch);

        String s1 = "hello";
        System.out.println(s1.compareTo(name));

        String str4 = s1.concat(name);
        System.out.println("concat:" +str4);

        System.out.println("contains:" +name.contains("Welcome"));







    }
}