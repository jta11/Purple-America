package version6;
import java.awt.Color;
import java.awt.geom.Path2D;

public class County
{
	private String name;
	private Path2D path;
	private Color color;
	
	public County(String name, Path2D path)
	{
		this.name = name;
		this.path = path;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public Path2D getPath()
	{
		return this.path;
	}
	
	public Color getColor()
	{
		return this.color;
	}
}