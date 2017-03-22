package version6;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PurpleCounties6 {

	public static void main(String[] args) {
		Frame6 test_frame = new Frame6();
	}
}

class Frame6 extends JFrame {
	private static final long serialVersionUID = 1L;
	private static JFrame gui;
	private static String year1 = "1960";
	public static boolean counties1;
	public static String[] states = { "AL", "AZ", "AR", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "ID", "IL", "IN", "IA", "KS",
			"KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC",
			"ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" };
	public static int[] years = {1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012};
	Painting6 painting = new Painting6(year1, counties1);

	public Frame6() {
		gui = new JFrame();
		gui.setTitle("Purple");
		init();
		gui.setSize(800, 495);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
		gui.setJMenuBar(menubar);

		JMenu counties = new JMenu("Counties");

		JMenuItem c1 = new JMenuItem("No");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6(year1, false);
				gui.add(painting);
				gui.validate();
				counties1 = false;
			}
		});

		JMenuItem c2 = new JMenuItem("Yes");
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6(year1, true);
				gui.add(painting);
				gui.validate();
				counties1 = true;
			}
		});

		counties.add(c1);
		counties.add(c2);

		menubar.add(counties);

		JMenu year = new JMenu("Year");

		JMenuItem y1 = new JMenuItem("1960");
		y1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1960", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1960";
			}
		});

		JMenuItem y2 = new JMenuItem("1964");
		y2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1964", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1964";
			}
		});

		JMenuItem y3 = new JMenuItem("1968");
		y3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1968", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1968";
			}
		});

		JMenuItem y4 = new JMenuItem("1972");
		y4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1972", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1972";
			}
		});

		JMenuItem y5 = new JMenuItem("1976");
		y5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1976", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1976";
			}
		});

		JMenuItem y6 = new JMenuItem("1980");
		y6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1980", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1980";
			}
		});

		JMenuItem y7 = new JMenuItem("1984");
		y7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1984", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1984";
			}
		});

		JMenuItem y8 = new JMenuItem("1988");
		y8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1988", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1988";
			}
		});

		JMenuItem y9 = new JMenuItem("1992");
		y9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1992", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1992";
			}
		});

		JMenuItem y10 = new JMenuItem("1996");
		y10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("1996", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "1996";
			}
		});

		JMenuItem y11 = new JMenuItem("2000");
		y11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("2000", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "2000";
			}
		});

		JMenuItem y12 = new JMenuItem("2004");
		y12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("2004", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "2004";
			}
		});

		JMenuItem y13 = new JMenuItem("2008");
		y13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("2008", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "2008";
			}
		});

		JMenuItem y14 = new JMenuItem("2012");
		y14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				gui.remove(painting);
				painting = new Painting6("2012", counties1);
				gui.add(painting);
				gui.validate();
				year1 = "2012";
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

	public void init() {
		//Set background color of frame
		Graphics g = gui.getGraphics();
		gui.setBackground(Color.WHITE);

		//Read state outlines file/USA.txt
		File f = new File("data/USA.txt");
		BufferedReader input1 = null;
		Scanner input = null;
		try {
			input1 = new BufferedReader(new FileReader(f));
			input = new Scanner(input1);
			Painting6.getPoints(input);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		input.close();
		try {
			input1.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//Loop through and merge duplicate states
		for(int count = 1; count < Painting6.states3.size(); count++)
		{
			if(Painting6.states3.get(count - 1).getName().equals(Painting6.states3.get(count).getName()))
			{
				Painting6.states3.get(count - 1).addStatePath(Painting6.states3.get(count).getStatePath().get(0));
				Painting6.states3.remove(count);
				count--;
			}
		}
		
		//Read each county file
		for(int j = 0; j < 1/*states.length*/; j++)
		{
			File counties = new File("data/DE" + ".txt");
			Scanner in2 = null;
			BufferedReader reader2 = null;
				
			try
			{
				//File file = new File("data/" + states[j] + ".txt");
				reader2 = new BufferedReader(new FileReader(counties));
				//getCountyPoints(reader2)
				in2 = new Scanner(reader2);
					
				Painting6.getCountyPoints(in2, j);
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
			
		Painting6.years.put(1960, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1964, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1968, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1972, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1976, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1980, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1984, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1988, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1992, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(1996, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(2000, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(2004, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(2008, (ArrayList<State>) Painting6.states3.clone());
		Painting6.years.put(2012, (ArrayList<State>) Painting6.states3.clone());
			
		for(int i = 0; i < 1/*Painting6.states3.size()*/; i++)
		{
			File f4 = new File("data/DE" + "1960.txt");
			HashMap<String, Color> countyColors = new HashMap<String, Color>();
				
			BufferedReader reader3 = null;
			Scanner in3 = null;
			try {
				reader3 = new BufferedReader(new FileReader(f4));

				in3 = new Scanner(reader3);
				countyColors = Painting6.getStateColors(in3);
			}

			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			in3.close();
			try {
				reader3.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			System.out.println(Painting6.states3.get(i).getName() + " " + countyColors.size() + " " + Painting6.states3.get(i).getStateCounties().size());
			
			for(int count = 0; count < Painting6.states3.get(i).getStateCounties().size(); count++)
			{
				Painting6.states3.get(i).getStateCounties().get(count).setColor(countyColors.get(Painting6.states3.get(i).getStateCounties().get(count).getName()));
			}
		}
	}

	static class Painting6 extends JPanel {

		//private static ArrayList<Path2D> states2 = new ArrayList<Path2D>();
		//private static ArrayList<Path2D> counties = new ArrayList<Path2D>();
		//private static ArrayList<String> stateNames = new ArrayList<String>();
		//private static ArrayList<String> countyNames = new ArrayList<String>();
		private static HashMap<String, Color> stateMap = new HashMap<String, Color>();
		private static String year;
		private static boolean counties1;
		
		static HashMap<Integer, ArrayList<State>> years = new HashMap<Integer, ArrayList<State>>();

		static ArrayList<State> states3 = new ArrayList<State>();

		private static final long serialVersionUID = 1L;

		public Painting6(String year, boolean counties) {
			setBackground(Color.WHITE);
			this.year = year;
			this.counties1 = counties;
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			//Set transform to scale/rotate states
			AffineTransform transform = new AffineTransform();
			g2d.setColor(Color.BLACK);
			g2d.setTransform(transform);
			transform.scale(13, 16);
			transform.rotate(Math.toRadians(270));
			transform.translate(-52, 126);

			//Draw states
			for(State s : Painting6.states3) {
				ArrayList<Path2D> path = s.getStatePath();
				ArrayList<County> stateCounties = s.getStateCounties();
				
				//Draw counties if "yes" has been selected
				if(counties1)
				{
					for(County c : stateCounties)
					{
						Shape shape = transform.createTransformedShape(c.getPath());
						g2d.draw(shape);
						
						g2d.setColor(c.getColor());
						g2d.fill(shape);
					}
				}
				
				else
				{
					
				}
				
				g2d.setColor(Color.BLACK);
				
				for (Path2D p : path) {
					Shape shape = transform.createTransformedShape(p);
					g2d.draw(shape);
				}
			}
		}

		public static void getPoints(Scanner input) {
			while (input.hasNextLine()) {
				String state = input.nextLine();
				String country = input.nextLine();
				String numPoints = input.nextLine();

				State s = new State(state);

				// System.out.println(state + " " + country + " " + numPoints);

				Path2D path = new Path2D.Double();

				for (int count = 0; count <= Integer.parseInt(numPoints); count++) {
					if (input.hasNextLine()) {
						String line = input.nextLine();

						if (line.trim().isEmpty()) {
							break;
						}

						// System.out.println(line);

						if (Character.isWhitespace(line.charAt(0))) {
							line = line.substring(1);
						}

						double num1 = Double.parseDouble(line.substring(0, line.indexOf(" ")));
						double num2 = Double.parseDouble(line.substring(line.lastIndexOf(" ") + 1));

						if (count == 0) {
							path.moveTo(num2, num1);
						}

						else {
							path.lineTo(num2, num1);
						}
					}
				}

				s.addStatePath(path);
				states3.add(s);
			}
		}
		
		public static void getCountyPoints(Scanner input, int indx) {
			while (input.hasNext()) {
				String county = input.next();
				String state = input.next();
				String numPoints = input.next();
				
				boolean exception = !Character.isDigit(numPoints.charAt(0)) || numPoints.contains(".");
				
				while (exception) {
					try {
						Integer.parseInt(numPoints);
						exception = false;
					}

					catch (Exception e) {
						county += " " + state;
						state = numPoints;
						numPoints = input.next();
					}
				}
				System.out.println(county);
				// System.out.println(county + state + numPoints);

				Path2D path = new Path2D.Double();

				for (int count = 0; count < Integer.parseInt(numPoints); count++) {
					if (input.hasNext()) {
						String next1 = input.next();
						String next2 = input.next();

						double num1 = Double.parseDouble(next1);
						double num2 = Double.parseDouble(next2);

						if (count == 0) {
							path.moveTo(num2, num1);
						}

						else {
							path.lineTo(num2, num1);
						}
						// System.out.println(num1 + " " + num2);
					}
				}

				County c = new County(county, path);
				states3.get(indx).addCounty(c);
			}
		}
		
		public static HashMap<String, Color> getStateColors(Scanner input) {
			input.nextLine();
			HashMap<String, Color> colors = new HashMap<String, Color>();
			while (input.hasNext()) {
				String line = input.nextLine();
				String state = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",") + 1);

				String r = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",") + 1);

				String d = line.substring(0, line.indexOf(","));
				line = line.substring(line.indexOf(",") + 1);

				String ot = line.substring(0, line.indexOf(","));

				int rep = Integer.parseInt(r);
				int dem = Integer.parseInt(d);
				int oth = Integer.parseInt(ot);
				int total = rep + dem + oth;
				
				Color c = new Color((rep * 255 / total), (oth * 255 / total), (dem * 255 / total));
				colors.put(state, c);
			}
			
			return colors;
		}
	}
}