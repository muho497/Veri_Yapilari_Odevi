import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Lütfen sayıları aralarında virgül olacak şekilde giriniz.");
        Scanner girdi = new Scanner(System.in);
        String dizi_toplu = (girdi.nextLine());

        int uzunluk=dizi_toplu.length();

        String [] karakterler = new String[uzunluk];
        String [] sayi_dizisi = new String[uzunluk];
        int    [] sayi_sayi   = new int[uzunluk];
        int z=0;


        for (int i=0;i<=uzunluk-1;i++){
            if(karakterler[i]== ","){
                for (int j = i+1;!(karakterler[j]==",");j++){
                  sayi_dizisi[z]+=karakterler[j];
                }
            }


        }
        for (int s = 0;s<sayi_dizisi.length;s++){
            sayi_sayi[s] = Integer.parseInt(sayi_dizisi[s]);
        }
        System.out.println(sayi_dizisi);
        */

        //Scanner girdi = new Scanner(System.in);
        //String dizi_toplu = (girdi.nextLine());
        //Yukarda kod dizi oluşturup bölmede ayırma kullanılan koddu bir yerde hata aldığım için yorum satıra olarak bıraktım.
        int [] dizi = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int uzunluk = dizi.length;//indis 0 yerine bir olarak düşürnürsek her  parent mesela birinci parent örnek verelim 1 parent çocukları 2n+0 2n+1 ve 2n+2 oluyor.Mesela 3 parent 2n+2 2n+3 ve 2n+4 elemanlar çocukları çıkıyor burdan şöyle bir mantık çıkıyor.Parentları çocukları 3 çocukluya göre hesaplarsak 3 tane 2n li veri geçiyor elimize bunların kuralları ise 2n+parent(kaçıncı eleman olduğu belirlemek için kullanılır.0'dan başlanmadan 1 'den başlayarak)-1,2n+parent,2n+parent+1
        int i = 1;
        int k = 0;
        int z = 0;
        for (i = 1;i<uzunluk;i++){
            k+=1;
            if(dizi[i]<dizi[2i+k] && dizi[i]<dizi[2i+1+k] && dizi[i]<dizi[2i+2+k]){
                System.out.println("Bu koşul doğru ise kontrol edilen parent min heap sıralamasına sadece bu parent uygundur.");
                z+=1;
            }//hepsi kontrol edildikten sonra eleman sayısı kadar aynı çıktıdan verecek burdan algoritmanın doğru çalışıp çalışmadığı konrtrol edilebilir.

        }
        if(uzunluk==z)
            System.out.println("Evet");
        else
            System.out.println("Hayır");
    }
}