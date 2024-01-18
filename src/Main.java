import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ebob=1;
        int ekok=1;
        Scanner input =new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        boolean deger = n1<n2;

        if (deger){
            System.out.println("ebob bulmak istiyorsannız 1 ekok için 2 yi tuşlayınız");
            int select = input.nextInt();
            if (select==1){
                int i=1;
                while (i<=n1){
                    if (n1 % i == 0 && n2 % i == 0){
                        ebob =i;
                    }
                    i++;
                }
                System.out.print("ebob degeri : "+ ebob);
            }else{
                int i= n1;
                while (i>1){
                    if (n1 % i == 0 && n2 % i == 0){
                        ekok =i;
                    }
                    i--;
                }
                System.out.print("ekok degeri : "+ ekok);
            }
        }else{
            System.out.println("ebob bulmak istiyorsannız 1 ekok için 2 yi tuşlayınız");
            int select = input.nextInt();
            if (select==1){
                int i=1;
                while (i<=n2){
                    if (n1 % i == 0 && n2 % i == 0){
                        ebob =i;
                    }
                    i++;
                }
                System.out.print("ebob degeri : "+ ebob);
            }else{
                int i= n2;
                while (i>1){
                    if (n1 % i == 0 && n2 % i == 0){
                        ekok =i;
                    }
                    i--;
                }
                System.out.print("ekok degeri : "+ ekok);
            }
        }
    }
}