import com.thor.iphone.model.IPhone;

public class App {
    public static void main(String[] args) throws Exception {

        IPhone telefone = new IPhone();
       
        System.out.println("******  USANDO O IPHONE  *******");
        System.out.println("********************************");
        
        System.out.println("");
        System.out.println("******  USANDO TELEFONE DO IPHONE  *******");
        telefone.tocar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
        System.out.println("********************************");
        System.out.println("");
        
        System.out.println("");
        System.out.println("******  USANDO NAVEGADOR DO IPHONE  *******");
        telefone.adicionarAba();
        telefone.exibirPagina("www.dio.me");
        telefone.atualizarPagina();
        
        System.out.println("********************************");
        System.out.println("");
        
        System.out.println("");
        System.out.println("******  USANDO TOCADOR DE MUSICA DO IPHONE  *******");
        telefone.selecionarMusica("A lista");
        telefone.tocar();
        telefone.pausar();
        
        System.out.println("********************************");
        System.out.println("");
    }

}
