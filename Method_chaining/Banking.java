class Account{
    String name;
    int balance;
    
   Account(String name){//construnctor should of same name as class
    this.name = name;
    this.balance = 0;
   }
    
    void withdraw(int amount){
        this.balance = this.balance - amount; 
        System.out.println(balance);
       
        }
        
    Account deposit(int amount){
        this.balance = this.balance + amount; 
        System.out.println(balance);
        return this;
        }    
        
        }
    
    
    public class main{
        public static void main(String argu[]){
            Account account = new Account("ram");
            account.deposit(1000).deposit(400).withdraw(800);
            
        }
    }
