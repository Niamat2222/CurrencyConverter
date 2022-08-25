import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConveter {
 
	public static void main(String[] args) {
 
		double amount , Euro , dollari , code , Punta , Afgaani;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("Hei, Tervetuloa Valuuttamuuntimeen!");
 
		System.out.println("Minkä valuutan haluat muuntaa? ");
		
		System.out.println("1:Euro \t2:Dollari \t3:Punta \n4:Afgaani ");
		code = sc.nextInt();
		
		System.out.println("Kuinka paljon rahaa haluat muuntaa ?");
		amount = sc.nextFloat();
 
		// Summien muuntamisen varten
		if (code == 1) {
                        
                    // Summien muuntaminen Euro-lla
			dollari = amount * 1;
			System.out.println("Your " + amount + " Euro is : " + f.format(dollari) + " Dollari");
 
			Punta = amount * 0.84;
			System.out.println("Your " + amount + " Euro is : " + f.format(Punta) + " Punta");
 
			Afgaani = amount * 87.66;
			System.out.println("Your " + amount + " Euro is : " + f.format(Afgaani) + " Afgaani");
                        
 
		} else if (code == 2) {
			// Summien muuntaminen Dollar-lla
 
			Euro = amount * 1;
			System.out.println("Your " + amount + " Dollari is : " + f.format(Euro) + " Euro");
 
			Punta = amount * 0.85;
			System.out.println("Your " + amount + " Dollari is : " + f.format(Punta) + " Punta");
 
			Afgaani = amount * 88.37;
			System.out.println("Your " + amount + " Dollari is : " + f.format(Afgaani) + " Afgaani");
 
                        
		} else if (code == 3) {
			// Summien muuntaminen Punta-lla
 
			Euro = amount * 1.19;
			System.out.println("Your " + amount + " Punta is : " + f.format(Euro) + " Euro");
 
			dollari = amount * 1.18;
			System.out.println("Your " + amount + " Punta is : " + f.format(dollari) + " dollari");
 
			Afgaani = amount * 104.06;
			System.out.println("Your " + amount + " Punta is : " + f.format(Afgaani) + " Afgaani");
 

		} else if (code == 4) {
			// Summien muuntaminen Afgaani-lla
 
			Euro = amount * 0.011;
			System.out.println("Your " + amount + " Afgaani is : " + f.format(Euro) + " Euro");
 
			dollari = amount * 0.011;
			System.out.println("Your " + amount + " Afgaani is : " + f.format(dollari) + " dollari");
 
			Punta = amount * 0.0096;
			System.out.println("Your " + amount + " Afgaani is : " + f.format(Punta) + " Punta");
 

                        
		} else {
			System.out.println("Virheellinen syöte");
		}
		
		System.out.println("Kiitos, että valitsit esimerkkiohjelmat");
	}
 
}
