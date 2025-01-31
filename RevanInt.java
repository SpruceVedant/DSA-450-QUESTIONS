// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).


classs revanint{
  public int reverse(int x){
    int res = 0;
    while(x != 0){
      int temp = x % 10;
      x = x/10;
      if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && temp > 7))
        return 0;
      if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && temp < -8))
        return 0;
      res = res * 10 + temp;
    }
    return res;
  }
}
