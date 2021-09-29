import java.util.Scanner;
 
public class Number1{
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        
        String homework = in.nextLine();
        char[] div_pro = homework.toCharArray();
        int count = 0;
        
        for(int i=div_pro.length-1; i>=0; i--){
            for(int j=i; j<div_pro.length; j++){
                String temp1 = homework.substring(i+1);
                String temp2 = homework.substring(i, j+1);
                if(temp1.contains(temp2)){
                    continue;
                }else{
                    count++;    
                }
            }
        }
        System.out.println(count);
        in.close();
    }
}
