package Question_number_2;

public class Rectangle implements Shape{
	   @Override
	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
		@Override
		public void clear() {
		      System.out.println("Inside Rectangle::clear() method.");
		}
}
