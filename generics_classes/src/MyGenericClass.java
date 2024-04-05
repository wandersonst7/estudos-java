public class MyGenericClass <AlgumaCoisa> {
    AlgumaCoisa value;

    MyGenericClass(AlgumaCoisa value){
        this.value = value;
    }

    public AlgumaCoisa getValue() {
        return value;
    }

    public void setValue(AlgumaCoisa value) {
        this.value = value;
    }
}
