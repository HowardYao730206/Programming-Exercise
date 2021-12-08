import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;
 
public class main {
 
    static long getNthFibNum(long n) {
        //long i = 3;
        long firstFib = 0;
        long secondFib = 1;
        long temp;
        long returnVal=0;
 
        if(n==1)
        {
            return 1;
        }
        for(long i=0;i<n-1;i++)
        {
            returnVal=firstFib+secondFib;
            temp=firstFib;
            firstFib=secondFib;
            secondFib=firstFib+temp;
        }
 
        return returnVal;
    }
 
    static int[] rotateNthPlace(int[] list,int n)
    {
        int[] listHolder = new int[n];
        for(int i=0;i<n;i++)
        {
            listHolder[i]+=list[i];
        }
 
        for(int i=n;i<list.length;i++)
        {
            list[i-n]=list[i];
        }
       
        for(int i=n;i>0;i--)
        {
            list[list.length-i]=listHolder[Math.abs(i-n)];
        }
        return list;
    }
 
    static String Convert(int n)
    {
        String output="";
        String value = String.valueOf(n);
        String[] list = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<value.length();i++)
        {
            output+=list[Integer.parseInt(value.substring(i,i+1))];
        }
       
        return output;
    }
 
    static ArrayList<String> Converter(int n)
    {
        ArrayList<Integer> output=new ArrayList();
        ArrayList<String> ans=new ArrayList();
        ArrayList<Integer> helper=new ArrayList();
        int value=1;
        helper.add(value);
        output.add(value);
        while(value!=n)
        {
            helper.add(value+1);
            for(int i:helper)
            {
                output.add(i);
            }
            value=value+1;
        }
 
        for(int i:output)
        {
            ans.add(Convert(i));
        }
       
        return ans;
    }
 
    public static void main(String[] args) {
        System.out.println(getNthFibNum(3473));//It exceeded the max value that can be hold......
        System.out.println("---------------------");
        int[] list = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotateNthPlace(list,3)));
        System.out.println("------------------------------------");
        for(String i:Converter(5))
        System.out.println(i);
 
 
    }
}
