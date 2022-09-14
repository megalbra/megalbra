public class MixStringLab
{
    public String getMixedString(String a, String b)
    {
        String result = "";
        // figure out which one is bigger string
        int biggestIndex = a.length(); // make assumption and check
        if( biggestIndex < b.length())
        {
            biggestIndex = b.length();
        }

        for( int i = 0; i < biggestIndex; i++)
        {
            if ( i < a.length())
            {
                result += a.charAt(i);
            }
            if ( i < b.length())
            {
                result += b.charAt(i);
            }
            }
        return result;
    }

    public static void main(String[] args)
    {
        MixStringLab obj = new MixStringLab(); // because using non-static methods, need an oject of the class name

        String a = "Hi";
        String b = "There";

        String result = obj.getMixedString(a,b); // call method using object and return String in result
        System.out.printf("The mixed string is %s", result);
    }
}
