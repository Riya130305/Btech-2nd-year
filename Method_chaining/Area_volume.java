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
        //return this;
        }
        
    Box area(){
        int one = this.length*this.width;
        int two = this.width*this.heigth;
        int three = this.heigth*this.length;
        int area = one+two+three;
        System.out.println(area);
        return this;
        }    
        
        }
    
    
    public class main{
        public static void main(String argu[]){
            Box box = new Box(2,3,7);
            box.area().volume();
            //box.area();
            
            }
        }s
