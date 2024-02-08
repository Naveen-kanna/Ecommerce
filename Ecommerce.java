import java.util.*;
 abstract class Data
{
 private String mail = "";
 private String num = "";
 private String pass = "";
void setmail(String a)
 {
  this.mail = a;
 }
 void setnum(String b)
 {
  this.num = b; 
 }
 void setpass(String c)
 {
  this.pass = c;
 }
 String getmail()
 {
  return this.mail;
 }
 String getnum()
 {
  return this.num;
 }
 String getpass()
 {
  return this.pass;
 }
}
class User extends Data
{
 static Scanner sc = new Scanner(System.in);
 static Data d1 = new User();
 void signup()
 {
  System.out.println("Enter your name to continue");
  String name = sc.nextLine();
  System.out.println("Enter your Phone Number");
  d1.setnum(ph(sc.next()));
  System.out.println("Enter your mail Id");
  d1.setmail(sc.next());
  System.out.println("Enter your password");
  d1.setpass(pw(sc.next()));
  signin();
  System.out.println("Login Succesful...");
  new Mart().shopping();
 }
 String ph(String p)
 {
  if(p.length()!=10)
  {
   System.out.println("Please enter a valid Phone number");
   ph(sc.next());
  }
  else if(p.charAt(0)=='0')
  {
   System.out.println("Please enter a valid Phone number");
   ph(sc.next());
  }
  else
  {
   for(int i=0; i<p.length(); i++)
   {
    char ch = p.charAt(i);
    if(ch < '0' || ch > '9')
    {
     System.out.println("Please enter a valid Phone number");
     ph(sc.next());
    }
   }
  }
  return p;
 }
 String pw(String pwd)
 {
  if(pwd.length()<6)
  {
   System.out.println("Password must contain minimum 6 characters");
   pw(sc.next());
  }
  return pwd;
 }
  void signin()
  {
   System.out.println("Please Sign-in using your credentials");
   System.out.println("Mail ID");
   mailcheck(sc.next());
   System.out.println("Password:");
   passcheck(sc.next());
  }
 void mailcheck(String mc)
 {
  if(!mc.equals(d1.getmail()))
  {
   System.out.print("Incorrect email please enter again");
   mailcheck(sc.next());
  }
 }
 void numcheck(String nc)
 {
  if(!nc.equals(d1.getnum()))
  {
   System.out.print("Incorrect number please enter again");
   numcheck(sc.next());
  }
 }
 void passcheck(String pc)
 {
  if(!pc.equals(d1.getpass()))
  {
   System.out.println("Incorrect password");
   System.out.println("1.Try again");
   System.out.println("2.Reset password");
   int n = sc.nextInt();
   switch(n)
   {
    case 1:
    {
     passcheck(sc.next());
     break;
    }
    case 2:
    {
     System.out.println("Enter your mobile number to reset your password");
     numcheck(sc.next());
     System.out.println("Enter new password");
     d1.setpass(pw(sc.next()));
     System.out.println("Password has been changed succesfully");
     signin();
     break;
    }
    default:
    {
     System.out.print("Invalid Selection Please Login again");
     signin();
    }
   }
  }
 }
}
class Login
{
 static Scanner sc = new Scanner(System.in);
 public static void main(String [] args)
 {
  System.out.println("<-------- Welcome to CVMart -------->");
  User u1 = new User();
  u1.signup();
 }
}
class Mart
{
 static Scanner sc = new Scanner(System.in);
 static int bill = 0;
  void shopping()
 {
  System.out.println("1. Clothing");
  System.out.println("2. Provisions");
  int n = sc.nextInt();
  switch(n)
  {
   case 1:
   {
    cloth();
    break;
   }
   case 2:
   {
    prov();
    break;
   }
  default:
  {
   System.out.println("Invalid selection please select again");
   shopping();
  }
  }
 }
  void cloth()
  {
   System.out.println("1. Men");
   System.out.println("2. Women");
   int n = sc.nextInt();
   switch(n)
   {
   case 1:
   {
    System.out.println("1. Shirts  ---> 500/-");
    System.out.println("2. Pants   ---> 600/-");
    System.out.println("3. Wallets ---> 200/-");
    int n1 = sc.nextInt();
    switch(n1)
    {
     case 1:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*500;
       bill(bill);
       break;
     }
     case 2:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*600; 
       bill(bill);
       break;
     }
     case 3:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*200;
       bill(bill);
       break; 
     }
     default:
     {
       System.out.println("Invalid selection please select again");
       cloth();
     }
    }
   }
   case 2:
   {
    System.out.println("1. T-Shirts  ---> 100/-");
    System.out.println("2. Jeans     ---> 200/-");
    System.out.println("3. Chudidhar ---> 300/-");
    int n1 = sc.nextInt();
    switch(n1)
    {
     case 1:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*100;
       bill(bill);
       break; 
     }
     case 2:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*200;
       bill(bill);
       break;  
     }
     case 3:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*300; 
       bill(bill);
       break; 
     }
     default:
     {
       System.out.println("Invalid selection please select again");
       cloth();
     }
   }
  }
  default:
  {
   System.out.println("Invalid selection please select again");
   cloth();
  }
  }
}
void prov()
  {
   System.out.println("1. Dairy Products");
   System.out.println("2. Groceries");
   int n = sc.nextInt();
   switch(n)
   {
   case 1:
   {
    System.out.println("1. Milk   ---> 30/-");
    System.out.println("2. Curd   ---> 30/-");
    int n1 = sc.nextInt();
    switch(n1)
    {
     case 1:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*30;
       bill(bill);
       break; 
     }
     case 2:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*30; 
       bill(bill);
       break; 
     }
     default:
     {
       System.out.println("Invalid selection please select again");
       prov();
     }
    }
   }
   case 2:
   {
    System.out.println("1. Cooking Oil  ---> 150/-");
    System.out.println("2. Sugar        ---> 100/-");
    int n1 = sc.nextInt();
    switch(n1)
    {
     case 1:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*150;
       bill(bill);
       break; 
     }
     case 2:
     {
       System.out.print("Select quantity: ");
       int q = sc.nextInt();
       bill = bill + q*100; 
       bill(bill);
       break; 
     }
     default:
     {
       System.out.println("Invalid selection please select again");
       cloth();
     }
   }
  }
  default:
  {
   System.out.println("Invalid selection please select again");
   prov();
  }
  }
}
 void bill(int bll)
 {
  System.out.printf("----- Bill Amout is: %d -----\n",bll);
  System.out.println("1. Confirm Billing");
  System.out.println("2. Continue Shopping");
  int n = sc.nextInt();
  switch(n)
  {
   case 1:
   {
     System.out.println("    ------- BILL DETAILS -------");
     System.out.printf("----- Total Bill Amout is: %d -----\n",bll);
     System.out.println("    ----------------------------");
     System.out.println("<--- Thank you for checking the price list --->");
     System.out.println("<---     Please Visit our Shop again       --->");
     System.exit(0);
   }
   case 2:
   {
     shopping();
   }
   default:
   {
     System.out.println("Invalid Selection please select again");
     bill(bll);
   }
  }
 }
}