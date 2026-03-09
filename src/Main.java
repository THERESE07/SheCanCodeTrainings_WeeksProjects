public class Main{
    public static void main(String [] args){
       int temp = -1;

       if(temp < 0){
           System.out.println("Freezing");
       }

       else if( temp == 0 || temp <= 20){
           System.out.println("Cold");
       }

       else{
           System.out.println("Warm");
       }
    }
}
