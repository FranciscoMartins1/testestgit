public class Utente {
    /*
    private String name;
    private String genre;
    private int age;
    private double height;
    private double weight;
    private static int instanceNumber = 0;

    private int state1 = 18;
    private int state2 = 25;

     */


    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;
    public static int instanceNumber=0;

    public static int state1 = 18;
    public static int state2 = 25;




    //private String classificacao;
    public void Utente(){
        this.nome = "";
        this.genero = "";
        this.idade = 0;
        this.altura = 0;
        this.peso = 0;
        instanceNumber++;
    }

    public Utente(String nome , int idade){
        this.nome = nome;
        this.idade = idade;
        instanceNumber++;
    }

    public Utente(String nome, String genero, int idade, double altura , double peso){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        instanceNumber++;
    }
    public static void setInstanceNumber(int instanceNumber) {
        Utente.instanceNumber = instanceNumber;
    }

    public static int getState1() {
        return state1;
    }

    public static void setState1(int nstate1) {
        state1 = nstate1;
    }

    public static int getState2() {
        return state2;
    }

    public static void setState2(int nstate2) {
        state2 = nstate2;
    }

    public static int getInstanceNumber() {
        return instanceNumber;
    }

    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}
