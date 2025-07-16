class Box{
void volume(int width, int height, int depth){
    System.out.println("Volume of the box is: " + (width * height * depth));
  }

  public static void main(String[] args) {
    Box box = new Box();
    box.volume(5, 10, 15);
  }
}
