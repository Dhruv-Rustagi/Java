package Assignment_9;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    private List<String> list = new ArrayList<>();
    public Regex(List<String> list) {
        this.list = list;
    }
    public void parse(String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        Formatter formatter = new Formatter(System.out);
        for(String str : list) {
            matcher = pattern.matcher(str);
            formatter.format("%1$-15.15s %2$-8.8s\n", str, matcher.find());
        }
    }
}
public class Assignment_9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ABCD . ");
        list.add("EFGH ! ");
        list.add("IJKL # ");
        list.add("MNOP ! ");
        list.add("QRSTU . ");
        list.add("VWXYZ ! ");
        
        Regex obj = new Regex(list);
        String regex="^[A-Z].*\\!";
        obj.parse(regex);
    }
}
