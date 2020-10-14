
public class NewString2

{

    public String newString(String str) //str  = Flexton // Flexn //Flen  //Fln //Fn //F

    {    

        if ((str==null)||(str.length() <= 1) )

            return str;

        return newString(str.substring(0,str.length()-2)) + str.charAt(str.length()-1);

    }

    public static void main(String[] args)

    {

        NewString2 obj=new NewString2();

        String str = "Flexton";

        System.out.println("New String   is \'"+obj.newString(str)+"\'");   

    }   

}