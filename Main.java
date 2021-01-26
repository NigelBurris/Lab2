class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int total;
    double blue;
    double brown;
    double green;
    double orange;
    double red;
    double yellow;
    total = 55 * 11;
    blue = total * 0.24;
    brown = total * 0.13;
    green = total * 0.16;
    orange = total * 0.20;
    red = total * 0.13;
    yellow = total * 0.14;
    System.out.println("Blue: " + blue);
    System.out.println("Brown: " + brown);
    System.out.println("Green: " + green);
    System.out.println("Orange: " + orange);
    System.out.println("Red: " + red);
    System.out.println("Yellow: " +yellow);
    double sum; 
    sum = blue + brown + green + orange + red + yellow;
    System.out.println("Sum: " + sum);
    if(blue > brown && red > orange)
    System.out.println("Blue over Brown and Red over Orange");
    if (brown <= green)
    System.out.println("Brown is less than or equal to green");
    if(sum == total)
    System.out.println("Numbers match");
  }
}