"# funcao" 

  package funçoes;
import java.util.Random;
import java.util.Scanner;
public class atv {
 public static void main (String []args) {
	 Scanner entrada = new Scanner (System.in);
	 int palpite=0, sorteado, tentativas=0;
	 Random geradorDeAleatorios = new Random();
     sorteado = geradorDeAleatorios.nextInt(1000) + 1;
     System.out.println("Número entre 1 e 1000 sorteado!");
     
     do{
         System.out.printf("\n\n\n\n-----------------\n");
         System.out.println("Número de tentativas: " + tentativas);
         
         System.out.print("Qual seu palpite: ");
         palpite = entrada.nextInt();
         
         tentativas++;
         
         dica(palpite,sorteado, tentativas);
     }while (palpite != sorteado);
	 
}
   public static void dica(int palpite, int numero, int tentativas){
     if(palpite > numero){
         System.out.println("Seu palpite é maior que o número sorteado.");
     } else {
         if(palpite < numero){
                 System.out.println("Seu palpite é menor que o número sorteado.");
         } else {
             System.out.println("Parabéns, você acertou! O número era " + numero);
             System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
         }
}
}
}
