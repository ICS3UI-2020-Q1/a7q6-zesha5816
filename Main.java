/**
 * a method named allDigitsOdd that returns whether every 	 digit of a positive integer is odd.
 * @author Ahmad Zeshan
 */
public class Main {

		public static void allDigitsOdd (int userInput){
			//initialize count
			int count=0;
			//only works while the value is greater than 0
			while(userInput > 0 || userInput < 0){
				/**when the number is divided by 2 and has a remainder of 0 meaning it is even so increase count bu 1
				*/
				if(userInput%2==0){
				count++;
				}
				//devide the number by 10 to reduce the last digit 
				userInput = userInput/10;
			}
			//if the count value ever increased meaning there was a even so output false to the user
			if(count>0){
				System.out.println("false");
			//if the value of count didnt change meaning it was odd and output true to the user
			}else if(count==0){
				System.out.println("true");
			}
		} 
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //call the function
		allDigitsOdd(13159);
    
  }
}
