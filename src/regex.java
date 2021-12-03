import java.util.regex.Matcher;
import java.util.regex.Pattern;
class REdemo {
    public static void main(String[] args) {
        String str="b%#@ab cdb bb9087 &";
        Pattern p=Pattern.compile("\\W");//pattern provided here
        // Pattern p1=Pattern.compile("",Pattern.CASE_INSENSITIVE)
        int ctr=0;
        Matcher m= p.matcher(str);//traget string provided here
        while(m.find())
        {
            System.out.println(m.start()+"-----"+m.end()+"------"+m.group());
            ctr++;
        }
        System.out.println("no of count= "+ctr);
  }
}

