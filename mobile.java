class  Samsungmobile
{
   String mobile_name;
   float mobile_price;
  String mobile_colour;
 static String OS;
   int ram;
  int Rear_camera;
   int Front_camera;
  static double Protection;
  static int Battery;
 static float Display;
 static int Storage;

}
class Mobile
{
public static void main(String args[])
{
Samsungmobile Galaxy=new Samsungmobile();
Galaxy.mobile_name="xy 20";
Galaxy.mobile_price=13000;
Galaxy.mobile_colour="gamma green";
Samsungmobile.OS="Android";                         
Galaxy.ram=4;
Galaxy.Rear_camera=42;
Galaxy.Front_camera=16;
Galaxy.Protection=3D;
Galaxy.Battery=4000;
Galaxy.Display=6.55f;
Galaxy.Storage=128;


System.out.println("----------The Mobile Detalis ---------");

System.out.println("mobile_name="+Galaxy.mobile_name);
System.out.println("mobile_price="+Galaxy.mobile_price);
System.out.println("mobile_colour="+Galaxy.mobile_colour);
System.out.println("OS="+Samsungmobile.OS);
System.out.println("ram="+Galaxy.ram);
System.out.println("Rear_camera="+Galaxy.Rear_camera);
System.out.println("Front_camera="+Galaxy.Front_camera);
System.out.println("Protection="+Galaxy.Protection);
System.out.println("Battery="+Galaxy.Battery);
System.out.println("Display="+Galaxy.Display);
System.out.println("storage="+Galaxy.Storage);


}
}