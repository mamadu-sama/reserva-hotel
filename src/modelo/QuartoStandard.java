public class QuartoStandard extends Quarto{

    public QuartoStandard(int numero){
        super(numero, 60.00);
    }

    @Override
    public String getTipo(){
        return "Standard";
    }

}
