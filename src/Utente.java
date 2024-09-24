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
.
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



    // method to calculate age difference
    // this method returns the age difference

    public int idadeDif(Utente utente){
        int difIdade = idade - utente.idade;
        if(difIdade < 0){
            //difIdade = (difIdade *(-2) )/ 2;
            difIdade = difIdade * (-1);
            System.out.println(utente.nome + " é mais velho!");
        }
        else if(difIdade == 0){
            System.out.println("Não há diferença de idades.");
            return 0;
        }
        else{
            System.out.println(nome + " é mais velho!");
            return difIdade;
        }
        return difIdade;
    }


//    public double calcularIMC(double peso , double altura){
//        String classificacao="";
//        double imc = peso /(altura*altura);
//        if(imc<18){
//            System.out.println(classificacao);
//        }
//        else if(imc>=18 && imc<=25){
//            System.out.println(classificacao);
//        }
//        else if(imc>25){
//            classificacao ="Obeso";
//            System.out.println(classificacao);
//        }
//        else{
//            return 0;
//        }
//
//        return imc;
//    }


    // method to calculate BMI
    // this method returns the state of persons health
    public double calcularIMC(){
        String classificacao="";
        double imc = peso /(altura*altura);
        if(imc<state1){
            classificacao ="Magro";
            System.out.print(classificacao+", IMC: ");
            return imc;
        }
        else if(imc>=state1 && imc<=state2){
            classificacao ="Saudável";
            System.out.print(classificacao+", IMC: ");
            return imc;
        }
        else if(imc>state2){
            classificacao ="Obeso";
            System.out.print(classificacao+", IMC: ");
            return imc;
        }
        else{
            return 0;
        }


    }

    public void getDegreeObesity(){

    }



    // method to check if the person is healthy
    // returns if its healthy or not
    public void checkHealthy(){
        double valueIMC = calcularIMC();
        if (valueIMC >= state1 && valueIMC<= state2){
            System.out.println("User is healthy");
        }
        else{
            System.out.println("User is not healthy");
        }
    }



    @Override
    public String toString(){
        return "Nome: "+ nome + " , Género: " + genero + " , Idade: " + idade + " , Altura: " + altura + " , Peso: " + peso;
    }

}
