package helo;

public class prime {
    public static void main(String args[]){
        //check number is prime or not
          int num = 23;
          int count = 0;
          for (int i = 1; i<=num; i=i+1){
              if(num % i==0){
                  count = count + 1;
              }
          }
          if (count==2){
            System.out.println("prime number");
          }else{
              System.out.println("not a prime number");
          }
    }
    
}
