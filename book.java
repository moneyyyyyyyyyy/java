import java.lang.*;
import java.util.*;
class book1
{
String name;
String author;
double price;
int pages;
book1()
{
name="";
author="";
price=0.0;
pages=0;
}
void getdetails()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the name of the book : ");
name=in.next();
System.out.println("Enter the name of the author : ");
author=in.next();
System.out.println("Enter the price of the book : ");
price=in.nextDouble();
System.out.println("Enter the number of pages : ");
pages=in.nextInt();
}
public String toString()
{
return("Name of the book : "+name+"\nAuthor of the book : "+author+"\nPrice of the book : "+price+"\nNumber of pages in the the book : "+pages);
}
}
class book
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of books : ");
n=sc.nextInt();
book1 b[]=new book1[n];
for(int i=0;i<n;i++)
{
b[i]=new book1();
b[i].getdetails();
System.out.println(b[i]);
}
}
}