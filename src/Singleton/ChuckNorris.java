package Singleton;

public class ChuckNorris {
    private static ChuckNorris instance = null;

    private String idade;
    private String voltasMundo;
    private float velocidade;

    private ChuckNorris(String idade, String voltasMundo, float velocidade) {
        setIdade(idade);
        setVoltasMundo(voltasMundo);
        setVelocidade(velocidade);
    }

    public static ChuckNorris getInstance(){
        if (instance == null){
            instance = new ChuckNorris("Eterna",  "A Terra que dá voltas em Chuck Norris", 1000);
        }
        return instance;
    }

    public static void setInstance(ChuckNorris instance) {
        ChuckNorris.instance = instance;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getVoltasMundo() {
        return voltasMundo;
    }

    public void setVoltasMundo(String voltasMundo) {
        this.voltasMundo = voltasMundo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
}
