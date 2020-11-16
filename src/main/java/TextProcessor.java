public class TextProcessor {

    public String upperCase (String a){
        return a.toUpperCase();
    }

    public String lowerCase (String b){
        return b.toLowerCase();
    }

    public String reverse (String c){
        StringBuilder sb = new StringBuilder(c);
        return sb.reverse().toString();
    }
}
