package helo;

public class countnumber {
    public static void main(String args[]){
    
    int count = 0; 
    int n = 294;
    while(n>0){
        n=n/10;
        count++;
    }
    System.out.println("total number of digit");
    System.out.println(count);
    
   }
}
