class Flower
{
void types()
{
System.out.println("Jasmin,Hibiscus");
}
}
class Jasmin extends Flower
{
void colour()
{
System.out.println("jasmin is in white colour");
}
}
class Hibiscus extends Flower
{
void smell()
{
System.out.println("hibiscus does not have smell");
}
}
class FlowerHierarchi
{
public static void main(String args[])
{
Jasmin j=new Jasmin();
Hibiscus h=new Hibiscus();
h.smell();
j.colour();
}
}
