package Singleton;

public class Main {
    public static void main(String[] args) {
        ChuckNorris Chuck = ChuckNorris.getInstance();
        Chuck.setIdade("Vida eterna");
        Chuck.setVoltasMundo("Chuck Norris que gira a Terra ao correr sobre ela");
        Chuck.setVelocidade(5000f);

        System.out.println("A idade de Chuck Norris é: " + Chuck.getIdade());
        System.out.println("A quantidade de voltas que Chuck Norris deu no mundo: " + Chuck.getVoltasMundo());
        System.out.println("A velocidade de Chuck Norris é " + Chuck.getVelocidade() + " vezes o número PI (usando todas as casas decimais, é obvio!)");
    }
}