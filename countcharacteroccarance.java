public class countcharacteroccarance {
    public static void main(String[] args) {
        String s="java program feature oops : ";
        int totalcount=s.length();
        int totalcount_aftrRemove=s.replace("a","").length();
        int count=totalcount-totalcount_aftrRemove;
        System.out.println("number occarance of a is "+count);

    }
}
