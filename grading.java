import java.util.Scanner;
public class grading {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter marks");
		int math = a.nextInt();
		Scanner b = new Scanner(System.in);
		int phy = b.nextInt();
		Scanner c = new Scanner(System.in);
		int che = c.nextInt();
		
		int sum = math+phy+che;
		System.out.println("Total marks is:"+sum);
		
		float avg = sum/3;
		System.out.println("Percentage is :"+avg);
		
		if (avg>= 80) {
			System.out.println("Congrats ..."
					+ "your grade is 'A'");}
			else if ( avg>= 60) {
				System.out.println("Keep it up.."
						+ " your grade is 'B'");
			}
			else if (avg>=40) {
				System.out.println("TRY.. HARD.."
						+"Your grade is 'C'");}
			else {
				System.out.println("Better Luck nxt time..."+
						"You Had been FAILED!!");
			}
		}
		}

