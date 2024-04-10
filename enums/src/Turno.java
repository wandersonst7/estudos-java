public enum Turno {

    // Isso só é possível por que criei um construtor
    MANHA("Manhã"), TARDE("Tarde"), NOITE("NOITE");

    private String value;
    Turno(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
