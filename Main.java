import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*
         İlkel Veri Tiplerinin------> Wrapper Class karşılıkları;

         boolean--------------------> Boolean
         char-----------------------> Character
         byte-----------------------> Byte
         short----------------------> Short
         int------------------------> Integer
         long-----------------------> Long
         float----------------------> Float
         double---------------------> Double


         */

        ArrayList<String> arraylist = new ArrayList<String>(); //String classından ArrayList oluşturabildik.

        /* ArrayList<int> arraylist2 = new ArrayList<int>(); /* Fakat int veritipinden oluşturamadık. Çünkü int ilkel bir
                                                             veri tipidir.
                                                             String veri tipi ilkel bir veri tipi olmadığı için ve bir
                                                             class olduğu için problem yaşamıyoruz.
                                                             ArrayList oluşturuken bir classtan referans almamız
                                                             gerekiyor. İlkel veri tipleri ile ArrayList oluşturmak
                                                             mümkün. Javada 8 adet ilkel veri tipine karşılık gelen
                                                             Wrapper Class'lara başvuruyoruz. */
        int a = 5; //ilkel veri tipinde ayı tanımladık.

        //a. dediğimiz zaman a bir ilkel veri tipinde tanımlı olduğu, bir class olmadığı için hata alıyoruz.

        Integer b = 7; //Bu sefer Integer wrapper class referansı şeklinde ile tanımladık.

        b.byteValue(); //Ve sıkıntısız bir şekilde class içerisindeki default metodları çağırabiliyoruz.

        ArrayList<Integer> arraylist2 = new ArrayList<Integer>(); //Integer wrapper class referansı ile tanımladık.

        //Autoboxing: İlkel bir veri tipini bir kutuya alıyoruz ve Wrapper Class cinsinde ArrayListe atıyoruz. Örnek;

        /*for (int i = 0 ; i < 10 ; i++){
            arraylist2.add(Integer.valueOf(i*4)); //Autoboxing
        }

        //Unboxing: Oluşturmuş olduğumuz bu ilkel verinin yer aldığı kutu içeriğini yazdırıyoruz.

        for (int i = 0 ; i < arraylist2.size() ; i++ ){
            System.out.println(arraylist2.get(i).intValue()); //Unboxing
        }*/

        //Fakat bunların kısa yolu mevcut:

        for (int i = 0 ; i < 10 ; i++){
           arraylist2.add(i*4); /* Autoboxing Kısa Versiyon
                                   Parantez içini kısalttık. Java burada bize zahmet vermeden kendisi Integer.valueOf(i*4);
                                   işlemini gerçekleştiriyor. */
        }

        for (int i = 0 ; i < arraylist2.size() ; i++){
            System.out.println(arraylist2.get(i)); /* Unboxing Kısa Versiyon
                                                      Burada da aynı şekilde Java arka planda
                                                      arraylist2.get(i).intValue(); işlemini gerçekleştiriyor. */
        }




    }

}
