class OperationDiv implements Operation{
public int getResult(int numberA, int numberB){
int result = 0;
if (numberB!=0) 
result = numberA / numberB;
else{
System.out.println("��������Ϊ0��");
System.exit(0);
}
return result;
}
}
