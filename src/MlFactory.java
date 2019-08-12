class MlFactory implements IFactory{
public Operation CreateOperation(){
	  return new OperationMul();
	}
}