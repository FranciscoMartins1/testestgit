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

}
