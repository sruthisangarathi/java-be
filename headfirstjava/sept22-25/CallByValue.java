

public class CallByValue {
int data=50;
void change(int data)
//void change(CallByValue obj)
{
data=data+100;
//obj.data=obj.data+100;
}
public static void main(String args[])
{
CallByValue obj=new CallByValue();
System.out.println("before change" + obj.data);
obj.change(500);
//obj.change(obj);
System.out.println("after change" + obj.data);
}
}

