public class App {

    public static void main(String[] args)  throws Exception{
        System.out.println("Parar o carro");
        System.out.println("Pegar ferramentas");
        rotacionarParafuso(1, true);
        rotacionarParafuso(2, true);
        rotacionarParafuso(3, true);
        rotacionarParafuso(4, true);

        System.out.println("Posicionar macaco");
        System.out.println("Levantar o carro");
        for(int i=1; i<=4; i++)
            rotacionarParafuso(i, true);

        System.out.println("Tirar pneu furado");
        System.out.println("Colocar step");
        for(int i=1; i<=4; i++)
            rotacionarParafuso(i, false);


        System.out.println("Abaixar o carro");
        for(int i=1; i<=4; i++)
            rotacionarParafuso(i, false);


        System.out.println("Guardar as ferramentas");
        System.out.println("Guardar o pneu furado");

    }

    static void rotacionarParafuso(int numParafuso, boolean antiHorario){
        System.out.println("Pegar a chave de roda");
        System.out.println("Posicionar chave no parafuso " + numParafuso);
        if(antiHorario==true)
            System.out.println("Rotacionar chave sentido anti-horário");
        else
            System.out.println("Rotacionar chave sentido horário");
        System.out.println("Retirar chave de roda");
    }
}