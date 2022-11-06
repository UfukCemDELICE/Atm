package org.example.Atm;
import java.util.Scanner;
public class Main {
    public static double bakiye1;
    public static double bakiye2;
    public static String kullanici1 = "kullanıcı1";
    public static String kullanici2 = "kullanıcı2";
    public static String password1 = "root1";
    public static String password2 = "root2";
    public static boolean cikis = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemSecenekleri = "Bakiye Görüntüleme --> 0 \n" +
                "Para Yatırma --> 1 \n" +
                "Para Çekme --> 2 \n" +
                "Havale --> 3 \n" +
                "EFT --> 4 \n" +
                "Ana Menüye Dön --> 5 \n" +
                "Çıkış --> 6 ";

        System.out.println("ATM 'ye hoşgeldiniz \nLütfen kullanıcı bilgilerinizi giriniz: ");
        System.out.println("Kullanıcı adı: ");
        String kullanici = scanner.nextLine();
        System.out.println("Şifre: ");
        String sifre = scanner.nextLine();

        while(cikis = true) {
            if (kullanici.equals("kullanıcı1") && sifre.equals("root1")) {
                System.out.println("Kullanıcı 1 'in hesabına giriş yapıldı! ");
                System.out.println("Lütfen birini şeçin: \n" + islemSecenekleri);
                //boolean anaMenu = true;
                while(true){
                    String secim = scanner.nextLine();
                    switch (secim) {
                        case "0":
                            System.out.println("Bakiyeniz: " + bakiye1);
                            break;
                        case "1":
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            double yatirilacakTutar = scanner.nextDouble();
                            bakiye1 += yatirilacakTutar;
                            System.out.println(bakiye1);
                            break;
                        case "2":
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            double cekilecekTutar = scanner.nextDouble();
                            if (bakiye1 < cekilecekTutar) {
                                System.out.println("Yetersiz bakiye! ");
                            } else {
                                bakiye1 -= cekilecekTutar;
                                System.out.println(bakiye1);
                            }
                            break;
                        case "3":
                            System.out.println("Havale edilecek tutarı giriniz: ");
                            double havaleTutarı = scanner.nextDouble();
                            if (bakiye1 < havaleTutarı) {
                                System.out.println("Yetersiz bakiye! ");
                            } else {
                                bakiye1 -= havaleTutarı;
                                bakiye2 += havaleTutarı;
                                System.out.println(bakiye1);
                            }
                            break;
                        case "4":
                            System.out.println("EFT tutarını giriniz: ");
                            double eftTutari = scanner.nextDouble();
                            if (bakiye1 < eftTutari) {
                                System.out.println("Yetersiz bakiye! ");
                            } else {
                                bakiye1 -= eftTutari;
                                bakiye2 += eftTutari;
                                System.out.println(bakiye1);
                            }
                            break;
                        case "5":
                            System.out.println("Tekrar görüşmek üzere! ");
                            cikis = false;
                    }
                }
            } else if (kullanici.equals("kullanıcı2") && sifre.equals("root2")) {
                System.out.println("Kullanıcı 2 'nin hesabına giriş yapıldı! ");
                System.out.println("Lütfen birini şeçin: \n " + islemSecenekleri);
                String secim = scanner.nextLine();
                switch (secim) {
                    case "0":
                        System.out.println("Bakiyeniz: " + bakiye2);
                        break;
                    case "1":
                        System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                        double yatirilacakTutar = scanner.nextDouble();
                        bakiye2 += yatirilacakTutar;
                        System.out.println(bakiye2);
                        break;
                    case "2":
                        System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                        double cekilecekTutar = scanner.nextDouble();
                        if (bakiye2 < cekilecekTutar) {
                            System.out.println("Yetersiz bakiye! ");
                        } else {
                            bakiye2 -= cekilecekTutar;
                            System.out.println(bakiye2);
                        }
                        break;
                    case "3":
                        System.out.println("Havale edilecek tutarı giriniz: ");
                        double havaleTutari = scanner.nextDouble();
                        if (bakiye2 < havaleTutari) {
                            System.out.println("Yetersiz bakiye! ");
                        } else {
                            bakiye2 -= havaleTutari;
                            bakiye1 += havaleTutari;
                            System.out.println(bakiye2);
                        }
                        break;
                    case "4":
                        System.out.println("EFT tutarını giriniz: ");
                        double eftTutari = scanner.nextDouble();
                        if (bakiye2 < eftTutari) {
                            System.out.println("Yetersiz bakiye! ");
                        } else {
                            bakiye2 -= eftTutari;
                            bakiye1 += eftTutari;
                            System.out.println(bakiye2);
                        }
                        break;
                    case "5":
                        System.out.println("Tekrar görüşmek üzere! ");
                        System.exit(0);
                        break;
                }
            } else {
                System.out.println("Kullanıcı adınız veya şifreniz yanlış! ");
            }
        }

    }
}