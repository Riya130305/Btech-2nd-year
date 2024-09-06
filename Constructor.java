class Box{
    int length;
    int width;
    int heigth;

   Box(int length,int width,int heigth){
    this.length =  length;
    this.width = width;
    this.heigth = heigth;
   }

    void volume(){
        int volume = this.length*this.width*this.heigth;
        System.out.println("volume:"+volume);
        }

    void area(){
        int one = this.length*this.width;
        int two = this.width*this.heigth;
        int three = this.heigth*this.length;
        int area = one+two+three;
        System.out.println("area:"+area);
        }

        }


    public class main{
        public static void main(int argu[]){
            Box box = new Box(2,3,7);
            box.volume();
            box.area();

            }
        }


*********************************
class Account{
    String name;
    int balance;
    
   Account(String name){//construnctor
    this.name = name;
    this.balance = 0;
   }
    
    void withdraw(int amount){
        this.balance = this.balance - amount; 
        System.out.println(balance);
        //return this;
        }
        
    void deposit(int amount){
        this.balance = this.balance + amount; 
        System.out.println(balance);
       // return this;
        }    
        
        }
    
    
    public class main{
        public static void main(String argu[]){
            Account account = new Account("ram");
            account.deposit(1000);
            account.deposit(400);
            account.withdraw(800);
            //box.area();}
        }
    }


*******************date 07/09/24********************

class Tree{//class
  int length;
  int heigth;
  //constructor making
  
  Tree(int length,int heigth){
    this.length = length;
    this.heigth = heigth; 
    
    }
  void pro(){
    System.out.println(this.length*this.heigth);
    }
  void sum(){
    System.out.println(this.length+this.heigth);
  }
}
public class MainClass {
  public static void main(String[] args) {
   Tree tree = new Tree(12,8);//new object
   tree.pro();
   tree.sum();
      
    }
}
