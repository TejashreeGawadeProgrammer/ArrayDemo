public class NewString

{

    public String newString(String str)

    {    

        if ((str==null)||(str.length() <= 1) )

            return str;
        
        return newString(str.substring(0,str.length()-2)) + str.charAt(str.length()-1);
        //return newString(str.substring(0,str.length()-2));
    }

    public static void main(String[] args)

    {

        NewString obj=new NewString();

        String str = "Flexton";
        
       
        System.out.println("New String   is \'"+obj.newString(str)+"\'");  
        System.out.println("The Length is "+str.length());
        System.out.println("The Length is "+(str.length()-2));
        
        System.out.println("String CharAt "+(str.charAt(str.length()-1)));

    }   

}