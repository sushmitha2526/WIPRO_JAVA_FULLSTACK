public class BOz

{
   private double width;
   private double height;
   private double depth;
   BOz(int width, int height, int depth)
   {
    this.width = width;
    this.height = height;
    this.depth = depth;

   }
   double getVolume()
    {
        return width * height * depth;

    }
    public static void main(String []args)
    {
        BOz box = new BOz(10, 20, 30);
        System.out.println("The volume of the box is: " + box.getVolume());
        System.out.println("The width of the box is: " + box.width);
    }
   }
