package Demo;

import org.springframework.beans.factory.annotation.Required;

@Component
public class Circle implements Shape{
	
	private Point center;
	
	@Override
	public void draw() {
		
		System.out.println("Drawing Tiangle");
		System.out.println("Circle : Point is : " + center.getX() + " , " + center.getY() + ")");
	}

	public Point getCenter() {
		return center;
	}
	
	//@Required
	//@Autowired
	//@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
}
