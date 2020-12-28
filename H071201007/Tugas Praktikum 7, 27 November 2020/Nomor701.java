import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

 class Nomor701 {

   static void printMovie (HashMap<Integer, String> m) {
     for (Integer num : m.keySet()) {
       String key = num.toString();
       String value = m.get(num);
       System.out.println(key + " . " + value);
     }

   }
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    HashMap<Integer, String> favavoritMovie = new HashMap<> ();
    favavoritMovie.put(1, "Avenger : Endgame");
    favavoritMovie.put(2, "Spiderman : Far From Home");
    favavoritMovie.put(3, "Venom");
    favavoritMovie.put(4, "Thor : Ragnarok");

    Map<Integer, String> rilis = new HashMap<> ();
    rilis.put(1, "24 April 2019");
    rilis.put(2, "26 Juni 2019" );
    rilis.put(3, "1 Oktober 2018 ");
    rilis.put(4, "10 Oktober 2017");

    Map<Integer, String> durasi = new HashMap<>();
    durasi.put(1, "3 Jam 1 Menit");
    durasi.put(2, "2 Jam 9 Menit");
    durasi.put(3, "1 Jam 52 Menit");
    durasi.put(4, "2 Jam 10 Menit");

    Map<Integer,String> genre = new HashMap<>();
    genre.put(1, "Adventure, Sci-Fi, Action");
    genre.put(2, "Adventure, Sci-Fi, Action");
    genre.put(3, "Adventure, Sci-Fi, Action");
    genre.put(4, "Adventure, Sci-Fi, Action, Fantasy, Comedy");

    Map<Integer, String> sinopsis = new HashMap<>();
    sinopsis.put(1, "ini sinopsis");
    sinopsis.put(2, "ini sinopsis");
    sinopsis.put(3, "ini sinopsis");
    sinopsis.put(4, "ini sinopsis");

    Map<Integer, String> cast = new HashMap<>();
    cast.put(1, "Robert Downey Jr., Chris Evan, Mark Ruffalo");
    cast.put(2, "Tom Holland, Samuel L. Jackson, Jake Gyllenhall");
    cast.put(3, "Tom Hardy, Michelle Williams, Riz Ahmed");
    cast.put(4, "Chris Hemsworth, Tom Hiddleston, Cate Blanchett");

    while (true) {
    printMovie(favavoritMovie);
    System.out.println("(d)Detail (s)Search (a)Add (r)Remove");

    String detail = input.next();
    if (detail.equals("d")) {
      int j = input.nextInt();
      String judul = favavoritMovie.get(j);
      String tglrilis = rilis.get(j);
      String durasifilm = durasi.get(j);   
      String genrefilm = genre.get(j);
      String sinopsisfilm = sinopsis.get(j);
      String pemain = cast.get(j);

      System.out.println("Judul    : " + judul);
      System.out.println("Rilis    : " + tglrilis);
      System.out.println("Durasi   : " + durasifilm);
      System.out.println("Genre    : " + genrefilm);
      System.out.println("Sinposis : " + sinopsisfilm);
      System.out.println("Cast     : " + pemain);

    }
    else if (detail.equals("s")) {
      String src = input.next();

      for (int i = 1;i <= favavoritMovie.size() ;i++) {
        if (favavoritMovie.get(i).contains(src)) {
          System.out.println("Hasil Pencarian Ditemukan : " + favavoritMovie.get(i));
        }
      }

    }
    else if (detail.equals("a")) {
      String judul = input.nextLine();

      judul = judul.substring(1);
      System.out.printf("judul    : %s", judul);

      System.out.printf("%nRilis    : ");
      String tglrilis = input.nextLine();

      System.out.printf("Durasi   : ");
      String durasifilm = input.nextLine();

      System.out.printf("Genre    : ");
      String genrefilm = input.nextLine();

      System.out.printf("Sinopsis : ");
      String sinopsisfilm = input.nextLine();

      System.out.printf("Cast     : ");
      String pemain = input.nextLine();

      favavoritMovie.put(favavoritMovie.size()+ 1, judul);
      rilis.put(rilis.size()+ 1, tglrilis);
      durasi.put(durasi.size()+ 1, durasifilm);
      genre.put(genre.size()+ 1, genrefilm);
      sinopsis.put(sinopsis.size()+ 1, sinopsisfilm);
      cast.put(cast.size()+ 1, pemain);

      printMovie(favavoritMovie);

    }
    else if (detail.equals("r")) {
    int j = input.nextInt();

    for (int i = 0;i  <favavoritMovie.size() - 1 ;i++ ) {
    favavoritMovie.replace(j+i, favavoritMovie.get(j+i+1));
    rilis.replace(j+i, rilis.get(j+i+1));
    durasi.replace(j+i, durasi.get(j+i+1));
    genre.replace(j+i, genre.get(j+i+1));
    sinopsis.replace(j+i, sinopsis.get(j+i+1));
    cast.replace(j+i, cast.get(j+i+1));
    }

    favavoritMovie.remove(favavoritMovie.size());
    rilis.remove(rilis.size());
    durasi.remove(durasi.size());
    genre.remove(genre.size());
    sinopsis.remove(sinopsis.size());
    cast.remove(cast.size());

    printMovie(favavoritMovie);

    }

  System.out.println("continue? yes/no");
  String ctn = input.next();
    if (ctn.equals("no")) {
    break;
    }
  }
  input.close();
  }
}
