package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String username,password,newpassword;
    int select;

    Scanner input = new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adınızı giriniz :  ");
        username = input.nextLine();

        System.out.println("Lütfen şifrenizi giriniz : ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.print("Giriş yapıldı!");
        }else if (username.equals("patika") && !password.equals("java123")){
            System.out.println("Şifreniz hatalıdır lütfen geçerli bir şifre giriniz!");
            System.out.println("Şifrenizi sıfırlamak istiyorsanız 'Evet' seçenegine, istemiyorsanız 'Hayır' seçeneğini seçiniz \n1-Evet\n2-Hayır");
        }
        select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Yeni şifreniz : " + input.nextLine());
                newpassword = input.nextLine();

                if (newpassword.equals("java123")){
                    System.out.println("HATA!!\nYeni oluşturacağınız şifre, eski şifrenizle aynı olmamalıdır.Lütfen farklı bir şifre giriniz!");
                }else {
                    System.out.println("Şifreniz tanımlanmıştır! :)");

                }
                break;
            case 2:
                System.out.println("Anasayfaya yönlendiriliyorsunuz");
                break;
        }



    }
}
