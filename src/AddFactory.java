class AddFactory implements IFactory{
public Operation CreateOperation(){
return new OperationAdd();
}
}