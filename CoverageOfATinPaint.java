package uk.ac.one;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
public class CoverageOfATinPaint {

	public static void main(String[] args) throws IOException{
		
		//declare some variables
		double height;
		double width;
		double area;
		double tinOfPaint;
		double numberOfTins; 
		
		String heightStr;
		String widthStr;
		String areaStr;
		String tinOfPaintStr;
		
		
		//set up a reader form the console window
		BufferedReader console =
				new BufferedReader (new InputStreamReader(System.in));
		
		//read in values interactively from the command line
		System.out.println("Please enter a value for the height: ");
		heightStr = console.readLine();
	    height = Double.parseDouble(heightStr);
		
		System.out.println("Please enter a value for the width: ");
		widthStr = console.readLine();
		width = Double.parseDouble(widthStr);
		
		System.out.println("Please enter a value for the area: ");
		areaStr = console.readLine();
		area = Double.parseDouble(areaStr);
		
		System.out.println("Please enter a value for the coverage of a tin of paint: ");
		tinOfPaintStr = console.readLine();
		tinOfPaint = Double.parseDouble(tinOfPaintStr);
				
		
		//for debugging we want to display our values to make sure everything is ok
		System.out.println("We have: ");
		System.out.println("Height value = " + height);
		System.out.println("Width value = " + width);
		System.out.println("Area value = " + area);
		System.out.println("Tin of paint value = " + tinOfPaint);

		
		//Calculate our number of tins value
		area = height * width; 
		numberOfTins = area / tinOfPaint;
		
		//Display  the value
		System.out.println("The number of tins needed for a given wall is " + numberOfTins + " Metres2");
				
	}

}
