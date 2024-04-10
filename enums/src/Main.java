public class Main {

    public static void main(String[] args) {

        imprimindoUserLevel(UserLevel.ADMIN);
        imprimindoTurnos(Turno.MANHA);

    }

    public static void imprimindoUserLevel(UserLevel userLevel){
        switch (userLevel){
            case ADMIN -> System.out.println("Administrador");
            case FUNC -> System.out.println("Funcionário");
            case USER -> System.out.println("Usuário Comum");
        }
    }

    public static void imprimindoTurnos(Turno turno){
        switch (turno){
            case MANHA -> System.out.println("Enum: " + Turno.MANHA.toString() + " - Valor: " + Turno.MANHA.getValue());
            case TARDE -> System.out.println("Enum: " + Turno.TARDE.toString() + " - Valor: " + Turno.TARDE.getValue());
            case NOITE -> System.out.println("Enum: " + Turno.NOITE.toString() + " - Valor: " + Turno.NOITE.getValue());
        }
    }

}