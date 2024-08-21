package guanabara;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("uma caneta" + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("tamanho da ponta eh " + this.ponta);
        System.out.println("o modelo eh " + this.modelo);
        System.out.println("quantidade de carga eh " + this.carga);

    }

    void rabiscar() {
        if(tampada == true){
            System.out.println("Erro!!! n posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
