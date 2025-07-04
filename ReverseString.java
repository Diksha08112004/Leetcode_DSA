class Reverse
{
    public void rev(char[] s)
    {
        int n=s.length;
        int start=0;
        int end=n-1;
        while(start<end)
        {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;    
            end--;
        }
        System.out.println(new String(s));
    }
}
class ReverseString
{
    public static void main(String args[])
    {
        String str="Hello, World!";

        Reverse r = new Reverse();
        r.rev(str.toCharArray());

    }
}