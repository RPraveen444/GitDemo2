public class Length_of_LastString {
    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";
        int length = lengthOfLastWord(input);
        System.out.println(length);
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        System.out.println(lastSpaceIndex);
        return s.length() - lastSpaceIndex - 1;
    }
}
