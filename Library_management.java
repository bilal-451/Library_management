import java.util.Scanner;
public class Project{
    
    public static void main(String args[]){
        char r;
        do{
            System.out.println("Library Management System");
            System.out.println("Press 1 to add book");
            System.out.println("Press 2 to issue a book");
            System.out.println("Press 3 to return a book");
            System.out.println("Press 4 to print complete issue details");
            System.out.println("Press 5 to exit");
            Scanner obj1=new Scanner(System.in);
            System.out.println("Enter any number");
            int e=obj1.nextInt();
            switch(e){
                case 1:
                  Library aa=new Library();
                  aa.add();
                  break;
                case 2:
                  Library bb=new Library();
                  bb.issue();
                  break;
                case 3:
                  Library cc=new Library();
                  cc.ret();
                  break;
                case 4:
                  Library dd=new Library();
                  dd.detail();
                  break;
                default:
                  System.out.println("Invalid Number");
            }
            System.out.println("you want to select next option Y/N");
            r=obj1.next().charAt(0);
            
        }
        while(r=='y' || r=='Y');
        if(r=='n' || r=='N'){
            Library z=new Library();
            z.exit();
        }


    }
}

class Library{
    static String str,b,d;
    static int a,c;
    void add(){
        System.out.println("Enter book name,price and Book_number");
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        float price=obj.nextInt();
        int book_number=obj.nextInt();
        System.out.println("Your details is"+str + price + book_number);

    }
    int getid(){
        return a;
    }
    void issue(){
        Scanner obj2=new Scanner(System.in);
        System.out.println("Book Name");
        str=obj2.nextLine();
        System.out.println("Book Id");
        a=obj2.nextInt();
        System.out.println("Issue Date");
        b=obj2.nextLine();
        System.out.println("Total Book Issued");
        c=obj2.nextInt();
        System.out.println("Book Return Date");
        d=obj2.nextLine();

    }

    void ret(){
        System.out.println("Enter student_name and Book_id");
        Scanner obj3=new Scanner(System.in);
        String name=obj3.nextLine();
        int id=obj3.nextInt();
        if(a==id){
            System.out.println("Total Details");
            System.out.println("Book name :"+Library.str);
            System.out.println("Book Id :"+Library.a);
            System.out.println("Issue date :"+Library.b);
            System.out.println("Total number of book issued :"+Library.c);
            System.out.println("Book return date :"+Library.d);

        }

        else{
            System.out.println("Book entered is a wrong one Please enter valid Book");
        }
    }


    void detail(){
        System.out.println("Book name :"+Library.str);
        System.out.println("Book Id :"+Library.a);
        System.out.println("Issue date :"+Library.b);
        System.out.println("Total number of book issued :"+Library.c);
        System.out.println("Book return date :"+Library.d);
    }

    void exit(){
        System.exit(0);
    }

}