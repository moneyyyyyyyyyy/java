import java.util.*;
import java.lang.*;
class student
{
String name,usn;
int marks[], credits[],sub,tot;
double sgpa;
void accept()
{ Scanner sc= new Scanner(System.in);
System.out.println(" ENTER THE NAME AND USN OF STUDENT");
name= sc.next();
usn=sc.next();
System.out.println("Enter num of subs");
sub= sc.nextInt();
marks=new int[sub];
credits=new int[sub];
System.out.println("Enter marks for each subject");
for( int i=0; i<sub;  i++)
{
marks[i] =sc.nextInt();
}
System.out.println(" Enter the credits");
for(int i=0; i<sub;i++)
{
credits[i] =sc.nextInt();
tot +=credits[i];
}
}
void sgp()
{

for(int i=0; i<sub; i++)
sgpa = (double)(sgpa+marks[i]*credits[i]);
sgpa= (double)sgpa/tot;
}
void display()
{
System.out.println("name " +name);
System.out.println("usn"  +usn);
System.out.println("marks ");
for(int i=0; i<sub; i++)
System.out.println(marks[i]+"\t");
System.out.println("credits");
for(int i=0; i<sub; i++)
System.out.println(credits[i]+"\t");


System.out.println("SGPA =" +sgpa);
}
}
class student1
{
public static void main(String args[])
{
student ob=new student();
ob.accept();
ob.sgp();
ob.display();
}
}
