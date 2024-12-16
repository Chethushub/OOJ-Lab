import java.util.*;
class Book
{
 private String name;
 private String author;
 private int num_pages;
 private double price;
 
  Book(String name,String author,int num_pages,double price)
 {
  this.name=name;
  this.author=author;
  this.num_pages=num_pages;
  this.price=price;
 }

 public void setName(String name)
 {
  this.name=name;
 }
 public String getName()
 {
  return name;
 }
 public void setAuthor(String author)
 {
  this.author=author;
 }
 public String getAuthor()
 {
  return author;
 }
 public void setNumPages(int num_pages)
 {
  this.num_pages=num_pages;
 }
 public int getNumPages()
 {
  return num_pages;
 }
 public void setPrice(double price)
 {
  this.price=price;
 }
 public double getPrice()
 {
  return price;
 }

 public String toString()
 {
  return "Book : "+ getName() +"Author : "+ getAuthor() +"NumPages : "+ getNumPages() +"Price : "+ getPrice();
 }
 public static void main(String []args)
 {
  int i;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the number of book");
  int n = in.nextInt();
  in.nextLine();
  Book[] b=new Book[n];
  for(i=0;i<n;i++)
  {
   System.out.println("Book "+(i+1)+" Name :");
   String name = in.nextLine();
   System.out.println("Author :");
   String author=in.nextLine();
   System.out.println("Number of pages in book :");
   int num_pages=in.nextInt();
   System.out.println("Price of this book :");
   double price=in.nextDouble();
   in.nextLine();
   b[i]=new Book(name,author,num_pages,price);
    }
    display(b);
    in.close();
 }
  static void display(Book[] b)
  {
   int i;
   for(i=0;i<b.length;i++)
   {
    System.out.println("Book "+(i+1));
    System.out.println(b[i].toString());
   }
   }
 }
 