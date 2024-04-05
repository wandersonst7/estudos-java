
/*
    * Number é uma classe abstrata no pacote java.lang.
    * Várias subclasses estendem a classe Number.
    * Os mais comumente usados são:
        * Byte
        * Short
        * Integer
        * Long
        * Double
        * Float
 */
public class MyGenericClassNumber<T extends Number> {
    T value;

    MyGenericClassNumber(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
