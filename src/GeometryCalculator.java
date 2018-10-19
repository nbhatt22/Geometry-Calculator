import java.util.Scanner;

public class GeometryCalculator 
{

	public static void main(String[] args) 
	{
		Scanner spookySeason = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = spookySeason.nextLine();
		System.out.println("\n\n\nHello, " + name + ", welcome to the Geometry Calculator!");
		System.out.print("Please enter to continue...");
		spookySeason.nextLine();
		
		
		System.out.println("\n\n\nAREA OF A TRIANGLE: \n");
		System.out.print("Please enter the length of the base: ");
		String baseStr = spookySeason.nextLine();
		double base = Double.parseDouble(baseStr); 
		System.out.print("Please enter the length of the height: ");
		String heightStr = spookySeason.nextLine();
		double height = Double.parseDouble(heightStr);
		System.out.print("Please enter the unit of measurement: ");
		String unit = spookySeason.nextLine();
		
		
		
		double area = 0.5 * base * height;
		System.out.print("\nThe area is " + area + " " + unit + "^2");
		
	
		Scanner boo = new Scanner(System.in);
		System.out.print("\n\n\nPlease enter to continue for finding the volume of a recangular prism...");
		boo.nextLine();
		System.out.println("\n\n\nVOLUME OF A RECTANGULAR PRISM: ");
		System.out.print("Please enter the length: ");
		String prismlengthStr = boo.nextLine();
		double prismlength = Double.parseDouble(prismlengthStr); 
		System.out.print("Please enter the width: ");
		String prismwidthStr = boo.nextLine();
		double prismwidth = Double.parseDouble(prismwidthStr);
		System.out.print("Please enter the height: ");
		String prismheightStr = boo.nextLine();
		double prismheight = Double.parseDouble(prismheightStr);
		System.out.print("Please enter the unit of measurement: ");
		String unit2 = boo.nextLine();
		
		double volume = prismlength * prismwidth * prismheight;
		System.out.print("\nThe volume is " + volume + " " + unit2 + "^3");
		
		
		Scanner halloween = new Scanner(System.in);
		System.out.print("\n\n\nPlease enter to continue for finding the roots of a polynomial...");
		halloween.nextLine();
		System.out.println("\n\n\nQUADRATIC FORMULA: ");
		System.out.print("Please enter the a value: ");
		String aValueStr = halloween.nextLine();
		double aValue = Double.parseDouble(aValueStr); 
		System.out.print("Please enter the b value: ");
		String bValueStr = halloween.nextLine();
		double bValue = Double.parseDouble(bValueStr);
		System.out.print("Please enter the c value: ");
		String cValueStr = halloween.nextLine();
		double cValue = Double.parseDouble(cValueStr);
		
		
		double root1 = (-1 * bValue + Math.sqrt(bValue * bValue - 4 * aValue * cValue)) / 2 * aValue;
		double root2 = (-1 * bValue - Math.sqrt(bValue * bValue - 4 * aValue * cValue)) / 2 * aValue;
		
		System.out.print("\nThe roots are " + root1 + " and " + root2);
		
		//change for commit
		
	}
	
}