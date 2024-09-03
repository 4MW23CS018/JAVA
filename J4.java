public class J4 {
    public static void main(String[] args) {
        String  s1,s2;
        int i;
        s1="ABCDE";
       for(i=0;i<6;i++)
       {
            for(int j=0;j<6-1-i;j++)
            {
                System.out.print(" ");
            }
            s2=s1.substring(0,i);
            System.out.println(" "+s2);
       }
       for(i=4;i>=0;i--)
       {
        for(int j=i;j<6;j++)
       {
           System.out.print(" ");
       }
       s2=s1.substring(0,i);
       System.out.println(s2);
       }
       

    }
    
}
