public class Main {
    public static void main(String[] args) {
          int a,b,c;
          var resultado=suma(10,20,30);

          Coche miCoche=new Coche();
          miCoche.IncrementarPuertas();

            System.out.println(miCoche.nPuertas);
            System.out.println(resultado);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

}

class Coche{
    public int nPuertas=3;

    public void IncrementarPuertas(){
        this.nPuertas++;
    }
}