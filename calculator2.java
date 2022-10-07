
class Calculator2 
{
public static void main(String[] args)
{
Calculator2 calc = new Calculator2(); 
calc.add(50,100);  //arugument passing method

calc.add(100,50); 
calc.add(50,100,150);
calc.add(10.5f,15.5f,25.5f);
}
void add(int n1,int n2) //parameter 
{
System.out.println(n1+n2);
}
void add(int n1, int n2 ,int n3)
{
System.out.println(n1+n2+n3);
}
void add (float n1,float n2,float n3)
{
System.out.println(n1+n2+n3);
}
}
