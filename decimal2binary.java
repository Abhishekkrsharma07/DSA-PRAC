
class main{
public static int Decimal2Binary(String n){
  int x = n.length();
  int nums=0;
  int p2=1;

  for(int i=x-1;i>=0;i++){
    if(n.charAt(i)=="1"){
      nums=nums+p2;
    }
    p2=p2*2;
  }
  return nums;
} 
  public static void main(String[] args){
    String n = "1011";
    System.out.println(Decimal2Binary(n));
  }
}
