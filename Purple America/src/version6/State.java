package version6;
import java.awt.geom.Path2D;
import java.util.ArrayList;

public class State
{
	private String name;
	private ArrayList<Path2D> statePath;
	private ArrayList<County> stateCounties;
	
	public State(String name)
	{
		this.name = name;
		statePath = new ArrayList<Path2D>();
		stateCounties = new ArrayList<County>();
	}
	
	public State(String name, ArrayList<Path2D> statePath, ArrayList<County> stateCounties)
	{
		this.name = name;
		this.statePath = statePath;
		this.stateCounties = stateCounties;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Path2D> getStatePath()
	{
		return this.statePath;
	}
	
	public ArrayList<County> getStateCounties()
	{
		return this.stateCounties;
	}
	
	public void addStatePath(Path2D path)
	{
		this.statePath.add(path);
	}
	
	public void addCounty(County county)
	{
		this.stateCounties.add(county);
	}
}