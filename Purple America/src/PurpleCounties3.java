import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jbenchx.annotations.*;

public class PurpleCounties3 {
	
    public static void main(String[] args) {
        Frame3 test_frame = new Frame3();
    }
}

class Frame3 extends JFrame {
    private static final long serialVersionUID = 1L;

    Painting4 painting = new Painting4();

    public Frame3() {
        JFrame gui = new JFrame();
        gui.setTitle("Purple");
        
        gui.setSize(950, 450);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(1, 1));

        pane.add(painting);
        gui.setVisible(true);
    }
}

class Painting4 extends JPanel {
	
	private static ArrayList<Path2D> states2 = new ArrayList<Path2D>();
	private static ArrayList<Path2D> counties = new ArrayList<Path2D>();
	private static ArrayList<String> stateNames = new ArrayList<String>();
	private static ArrayList<String> countyNames = new ArrayList<String>();
	private static HashMap<String, Color> stateMap = new HashMap<String, Color>();
	
    private static final long serialVersionUID = 1L;
 
    public Painting4() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        File f = new File("data\\USA.txt");
		Scanner input;
		try 
		{
			input = new Scanner(f);
			getPoints(input);
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Graphics2D g2d = (Graphics2D) g;
		
		AffineTransform transform = new AffineTransform();
		g2d.setColor(Color.BLACK);
		g2d.setTransform(transform);
		transform.scale(13, 16);
		transform.rotate(Math.toRadians(270));
		transform.translate(-50, 125);
		
		File f2 = new File("data\\USA2012.txt");
		Scanner in;
		try
		{
			in = new Scanner(f2);
			get2012Colors(in);
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int indx = 0;
		
		
		String[] states = {"AL", "AZ", "AR", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
		for(int j = 0; j < states.length; j++) {
			File count = new File("data\\" + states[j] + ".txt");
			Scanner in2;
			try 
			{
				in2 = new Scanner(count);
				getCountyPoints(in2);
			} 
			
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			File f4 = new File("data\\" + states[j] + "1968.txt");
			Scanner in3;
			try 
			{
				in3 = new Scanner(f4);
				get2012Colors(in3);
			} 
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int indx2 = 0;
		
			for(Shape p2 : counties)
			{
				Shape s = transform.createTransformedShape(p2);
				g2d.setColor(stateMap.get(countyNames.get(indx2)));
				g2d.fill(s);
				indx2++;
			}
		}
		
		for(Shape p : states2)
		{
			Shape s = transform.createTransformedShape(p);
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
			
			states2.add(path);
		}
	}
    
    public static void getCountyPoints(Scanner input)
	{
		while(input.hasNext())
		{
			String county = input.next();
			String state = input.next();
			String numPoints = input.next();
			boolean exception = !Character.isDigit(numPoints.charAt(0)) || numPoints.contains(".");
			countyNames.add(county);
			
			while(exception)
			{
				try
				{
					Integer.parseInt(numPoints);
					exception = false;
				}
				
				catch(Exception e)
				{
					county += state;
					state = numPoints;
					numPoints = input.next();
				}
			}
			
			
			//System.out.println(county + state + numPoints);
			
			Path2D path = new Path2D.Double();
			
			for(int count = 0; count < Integer.parseInt(numPoints); count++)
			{
				if(input.hasNext())
				{
					String next1 = input.next();
					String next2 = input.next();
					
					double num1 = Double.parseDouble(next1);
					double num2 = Double.parseDouble(next2);
					
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
			
			counties.add(path);
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