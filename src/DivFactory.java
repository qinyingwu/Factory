class DivFactory implements IFactory{
public Operation CreateOperation(){
return new OperationDiv();
}
}