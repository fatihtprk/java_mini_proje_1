public class Main {
    public static void main(String[] args) {
        //mükemmel sayı kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayıdır.
        int sayi=28;    //28 -> 1,2,4,7,14 -> 1+2+4+7+14=28
        int sayac=0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                //bu ifade kalansız bölen yani tam bölenleri sayaca toplayarak eklemektedir
                sayac=sayac+i;
            }
        }
        if(sayac==sayi){
            //for döngüsü sonucunda sayaç=sayi çıkarsa sayı mükemmel sayıdır.
            System.out.println("Girilen sayi mukemmel sayidir.");
        }
        else System.out.println("Degil");
    }
}
