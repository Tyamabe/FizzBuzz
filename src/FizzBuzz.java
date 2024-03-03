
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i =1 ; i < 101; i++) {
			if(i % 3 == 0) {
				if(i % 5 == 0){
				System.out.println("FizzBuzz");	
				continue;
				}
				else {
					System.out.println("Fizz");
					continue;
				}
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
				continue;
			}
		System.out.println(i);
		}

	}

}
