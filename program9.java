import java.lang.System;
//Remove vowels
class main{
    public static void main(String arg[]){
        String s;
        Scanner sc =new Scanner(System.in);
        s= sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<sb.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                sb.deletecharAt(i);
                i--;
            }
        }
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}