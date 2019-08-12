class SubFactory implements IFactory {
public Operation CreateOperation(){
return new OperationSub();
}
}