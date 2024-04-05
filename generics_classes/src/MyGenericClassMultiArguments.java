public class MyGenericClassMultiArguments <T, E, I>{

    T valueT;
    E valueE;
    I valueI;


    MyGenericClassMultiArguments(T valueT, E valueE, I valueI){
        this.valueT = valueT;
        this.valueE = valueE;
        this.valueI = valueI;
    }

    public T getValueT() {
        return valueT;
    }

    public void setValueT(T valueT) {
        this.valueT = valueT;
    }

    public E getValueE() {
        return valueE;
    }

    public void setValueE(E valueE) {
        this.valueE = valueE;
    }

    public I getValueI() {
        return valueI;
    }

    public void setValueI(I valueI) {
        this.valueI = valueI;
    }
}
