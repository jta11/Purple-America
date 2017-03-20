package version6;
import java.awt.geom.Path2D;

public class County
{
	private String name;
	private Path2D path;
	
	public County(String name, Path2D path)
	{
		this.name = name;
		this.path = path;
	}
}