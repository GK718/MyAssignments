package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      int range = 8, firstNum = 1, secNum = 2 ;
      System.out.println (firstNum);
      System.out.println (secNum);
	  
      for (int i=1; i<=range; i++);
      int sum ;
      sum=firstNum+secNum;
      firstNum=secNum;
      secNum=sum;
      System.out.println(sum);     
      
  }
}
