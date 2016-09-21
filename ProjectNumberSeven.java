import java.util.Scanner;

public class ProjectNumberSeven {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type in a positive number followed by 'ENTER'");
		int x = scan.nextInt();
		
		countDown(x);
		
		scan.close();
		
	}

	public static void countDown(int x){
		
		System.out.println(x);
		if (x==0){return;}
		countDown(x-1);
	}
}
