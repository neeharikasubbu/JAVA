class Neeha{

// same methods mtd2 but with different arguments and differ in order and number

void mtd2(int x,char b){
}
void mtd2(char c,char d,char e){
}
 public void mtd2(char b){
// differs in specifiers
}
int void mtd2(char b,int x){
// differs in return type
}

public static void main(String[] args){
Neeha n1=new Neeha();
n1.mtd2(10,'b');
System.out.println(10,'b');
}
}