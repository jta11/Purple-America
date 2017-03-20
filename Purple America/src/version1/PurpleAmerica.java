package version1;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.io.*;
import java.util.*;
public class PurpleAmerica
{
	
	private static ArrayList<Path2D> states = new ArrayList<Path2D>();
	private static ArrayList<String> stateNames = new ArrayList<String>();
	private static HashMap<String, Color> stateMap = new HashMap<String, Color>();
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("Data\\USA.txt");
		Scanner input = new Scanner(f);
		getPoints(input);
		
		DrawingPanel panel = new DrawingPanel(950, 450);
		panel.setBackground(Color.WHITE);
		Graphics g = panel.getGraphics();
		Graphics2D g2d = (Graphics2D) g;
		
		AffineTransform transform = new AffineTransform();
		g2d.setColor(Color.BLACK);
		g2d.setTransform(transform);
		transform.scale(13, 16);
		transform.rotate(Math.toRadians(270));
		transform.translate(-50, 125);
		
		File f2 = new File("Data\\USA2012.txt");
		Scanner in = new Scanner(f2);
		get2012Colors(in);
		int indx = 0;
		
		for(Shape p : states)
		{
			Shape s = transform.createTransformedShape(p);
			g2d.setColor(stateMap.get(stateNames.get(indx)));
			g2d.fill(s);
			g2d.setColor(Color.WHITE);
			g2d.setStroke(new BasicStroke(0.01f));
			g2d.draw(s);
			indx++;
		}
	}
	
	public static void getPoints(Scanner input)
	{
		while(input.hasNextLine())
		{
			String state = input.nextLine();
			String country = input.nextLine();
			String numPoints = input.nextLine();
			stateNames.add(state);
			
			//System.out.println(state + " " + country + " " + numPoints);
			
			Path2D path = new Path2D.Double();
			
			for(int count = 0; count <= Integer.parseInt(numPoints); count++)
			{
				if(input.hasNextLine())
				{
					String line = input.nextLine();
					
					if(line.trim().isEmpty())
					{
						break;
					}
					
					//System.out.println(line);
		
					if(Character.isWhitespace(line.charAt(0)))
					{
						line = line.substring(1);
					}
					
					double num1 = Double.parseDouble(line.substring(0, line.indexOf(" ")));
					double num2 = Double.parseDouble(line.substring(line.lastIndexOf(" ") + 1));
					
					if(count == 0)
					{
						path.moveTo(num2,  num1);
					}
					
					else
					{
						path.lineTo(num2,  num1);
					}
					//System.out.println(num1 + " " + num2);
				}
			}
			
			states.add(path);
		}
	}
	
	public static void get2012Colors(Scanner input)
	{
		input.nextLine();
		int s = 0;
		while(input.hasNext())
		{
			String line = input.nextLine();
			String state = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",") + 1);
			
			String r = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",") + 1);
			
			String ob = line.substring(0, line.indexOf(","));
			line = line.substring(line.indexOf(",") + 1);
			
			String ot = line.substring(0, line.indexOf(","));
			
			int rom = Integer.parseInt(r);
			int oba = Integer.parseInt(ob);
			int oth = Integer.parseInt(ot);
			int total = rom + oba + oth;
			
			Color c = new Color((rom * 255 / total), (oth * 255 / total), (oba * 255 / total));
			stateMap.put(state, c);
			s++;
		}
	}
}