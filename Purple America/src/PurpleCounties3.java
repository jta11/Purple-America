import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PurpleCounties3 {
	
    public static void main(String[] args) {
        Frame3 test_frame = new Frame3();
    }
}

class Frame3 extends JFrame {
    private static final long serialVersionUID = 1L;
    private static JFrame gui;
    Painting3 painting = new Painting3("1960");

    public Frame3() {
        gui = new JFrame();
        gui.setTitle("Purple");
        
        gui.setSize(950, 495);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenuBar menubar = new JMenuBar();
        gui.setJMenuBar(menubar);
        
        JMenu year = new JMenu("Year");
        
        JMenuItem y1 = new JMenuItem("1960");
        y1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	   gui.remove(painting);
                   painting = new Painting3("1960");
                   gui.add(painting);
                   gui.validate();
                   
            }
        });
        
        JMenuItem y2 = new JMenuItem("1964");
        y2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1964");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y3 = new JMenuItem("1968");
        y3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1968");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y4 = new JMenuItem("1972");
        y4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1972");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y5 = new JMenuItem("1976");
        y5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1976");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y6 = new JMenuItem("1980");
        y6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1980");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y7 = new JMenuItem("1984");
        y7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1984");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y8 = new JMenuItem("1988");
        y8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1988");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y9 = new JMenuItem("1992");
        y9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1992");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y10 = new JMenuItem("1996");
        y10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("1996");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y11 = new JMenuItem("2000");
        y11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("2000");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y12 = new JMenuItem("2004");
        y12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("2004");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y13 = new JMenuItem("2008");
        y13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("2008");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        JMenuItem y14 = new JMenuItem("2012");
        y3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
            	  gui.remove(painting);
                  painting = new Painting3("2012");
                  gui.add(painting);
                  gui.validate();
            }
        });
        
        year.add(y1);
        year.add(y2);
        year.add(y3);
        year.add(y4);
        year.add(y5);
        year.add(y6);
        year.add(y7);
        year.add(y8);
        year.add(y9);
        year.add(y10);
        year.add(y11);
        year.add(y12);
        year.add(y13);
        year.add(y14);
        
        menubar.add(year);
        
        Container pane = gui.getContentPane();
        pane.setLayout(new GridLayout(1, 1));

        pane.add(painting);
        
        gui.setVisible(true);
    }
}

class Painting3 extends JPanel {
	
	private static ArrayList<Path2D> states2 = new ArrayList<Path2D>();
	private static ArrayList<Path2D> counties = new ArrayList<Path2D>();
	private static ArrayList<String> stateNames = new ArrayList<String>();
	private static ArrayList<String> countyNames = new ArrayList<String>();
	private static HashMap<String, Color> stateMap = new HashMap<String, Color>();
	private static String year;
	
    private static final long serialVersionUID = 1L;
 
    public Painting3(String year) 
    {
        setBackground(Color.WHITE);
        this.year = year;
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
			e.printStackTrace();
		}
		
		Graphics2D g2d = (Graphics2D) g;
		
		AffineTransform transform = new AffineTransform();
		g2d.setColor(Color.BLACK);
		g2d.setTransform(transform);
		transform.scale(13, 16);
		transform.rotate(Math.toRadians(270));
		transform.translate(-53, 125);
		
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
				e.printStackTrace();
			}
			
			
			File f4 = new File("data\\" + states[j] + year + ".txt");
			Scanner in3;
			try 
			{
				in3 = new Scanner(f4);
				getStateColors(in3);
			} 
			
			catch (FileNotFoundException e) 
			{
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
	
    public static void getStateColors(Scanner input)
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