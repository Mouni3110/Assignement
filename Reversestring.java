import java.util.*;
class Reversestring{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the string: ");
             String str=sc.nextLine();
             String words[] = str.split(" ");
              String word[];
             for(int i=0;i<=words.length;i++){ 
                   word [i]=words[i].reverse();
                   System.out.println(word[i]);
            }
    }
}