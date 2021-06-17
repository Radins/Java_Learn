import java.awt.Dimension;
import java.awt.Toolkit;

class Program{  
    public static void main(String args[]){  
        System.out.println("A linguagem do sistema é: " + System.getProperty("user.language"));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        System.out.println("Largura da tela: " + width +"\nAltura da tela: " + height);
    }  
}  