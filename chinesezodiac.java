import java.util.Scanner ;

public class chinesezodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int birthYear;
		System.out.print("Do�um y�l�n�z� giriniz: ");
		birthYear = input.nextInt();
		
		if(birthYear%12==0) {
			System.out.print("Maymun");
			}
			else if(birthYear%12==1) {
			System.out.print("Horoz");
			}
			else if(birthYear%12==2) {
			System.out.print("K�pek");
			}
			else if(birthYear%12==3) {
			System.out.print("Domuz");
			}
			else if(birthYear%12==4) {
			System.out.print("Fare");
			}
			else if(birthYear%12==5) {
			System.out.print("�k�z");
			}
			else if(birthYear%12==6) {
			System.out.print("Kaplan");
			}
			else if(birthYear%12==7) {
			System.out.print("Tav�an");
			}
			else if(birthYear%12==8) {
			System.out.print("Ejderha");
			}
			else if(birthYear%12==9) {
			System.out.print("Y�lan");
			}
			else if(birthYear%12==10) {
			System.out.print("At");
			}
			else if(birthYear%12==11) {
			System.out.print("Koyun");
			}
			
					
		
	}

}
