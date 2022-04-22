import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String userName,password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = inp.nextLine();
        System.out.print("Şifreniz:");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java")){
            inp.close();
            System.out.print("Başarılı Giriş!");
        }else{
            System.out.print("Kullanıcı adı veya şifre hatalı!\nŞifre Sıfırlama işlemi için 1 \nÇıkış yapmak için 0 giriniz!\n");
            System.out.print("Yapmak istediğiniz işlem: ");
            int enteredValue = inp.nextInt();
            switch (enteredValue){
                case 0:
                inp.close();
                System.out.println("Çıkış yapılıyor...");
                break;
                case 1:
                System.out.print("Yeni Şifreyi giriniz: ");
                Scanner inp2 = new Scanner(System.in);
                String newPassword = inp2.nextLine();
                if(newPassword.equals("java")){
                    System.out.println("Şifre oluşturulamadı,lütfen başka şifre giriniz.");
                }else{
                    System.out.print("Şifre oluşturuldu.");
                }
                break;
                default:
                System.out.println("Hatalı giriş yaptınız!");
                break;
            }
        }

   }
}
