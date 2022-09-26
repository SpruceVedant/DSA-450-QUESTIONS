// Given a number N. Count the number of digits in N which evenly divides N.\

class countdigits{
  public static void main(String[] args){
    int n = 12;
    int count = 0;
    int temp = n;
    while(temp>0){
      int rem = temp % 10;
      if(rem !=0 && n % rem==0){
        count++;
      }
      temp =  temp / 10;
    }
    System.out.println(count);
  }
}
