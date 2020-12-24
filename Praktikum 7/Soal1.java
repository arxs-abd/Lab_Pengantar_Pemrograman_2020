//Nama  : Adi Indra Muliani
//Nim   : H071201095
import java.util.*;
public class Soal1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>>filmFavorite = new HashMap<>();
        Scanner scan = new Scanner(System.in);
       filmFavorite.put("Judul", new ArrayList<>());
       filmFavorite.put("Rilis", new ArrayList<>());
       filmFavorite.put("Durasi", new ArrayList<>());
       filmFavorite.put("Genre", new ArrayList<>());
       filmFavorite.put("Sinopsis", new ArrayList<>());
       filmFavorite.put("Cast", new ArrayList<>());
        String cek = "Y";
        while(cek.equalsIgnoreCase("Y")){
            daftarFilm(filmFavorite);
            System.out.println("(d) detail (s) search (a) add (r) remove");
            String input = scan.next();
        if(input.equalsIgnoreCase("d")){
            int nomorFilm = scan.nextInt() - 1;
            detailFilm(nomorFilm,filmFavorite);
            System.out.println("Yes/No Lanjutkan daftar Film");
            cek = scan.next();
        }
        else if(input.equalsIgnoreCase("a")){
            addFilm(filmFavorite,scan);
            daftarFilm(filmFavorite);
            System.out.println("Yes/No Lanjutkan daftar Film");
            cek = scan.next();
        }
        else if(input.equalsIgnoreCase("r")){
            int deleteNumberOfFilm = scan.nextInt() - 1;
            removeFilm(deleteNumberOfFilm,filmFavorite);
            daftarFilm(filmFavorite);
            System.out.println("Yes/No Lanjutkan daftar Film");
            cek = scan.next();
        }
        else if(input.equalsIgnoreCase("s")){
            String input2 = scan.next();
            System.out.printf(search(input2,filmFavorite));
            System.out.println("stop? (Yes/No) ");
            cek = scan.next();

        }
        else{
            System.out.println("Berhenti? (Yes/No)");
            cek = scan.next();
        }
      }  
    }
    public static void daftarFilm(HashMap<String, ArrayList<String>> filmFavorite){
        ArrayList<String> judulFilm = filmFavorite.get("Judul");
        System.out.println("Film Favorite");
        if(judulFilm.isEmpty()){
            System.out.println("Isi Kosong");
        }
        for(int i = 0; i < judulFilm.size(); i++){
            System.out.println(i + 1 +". "+ judulFilm.get(i));
        }
    }
    public static void detailFilm(int numberFilm, HashMap<String, ArrayList<String>> filmFavorite){
        System.out.println("Judul: " + filmFavorite.get("Judul").get(numberFilm));
        System.out.println("Rilis: " + filmFavorite.get("Rilis").get(numberFilm));
        System.out.println("Durasi: " + filmFavorite.get("Durasi").get(numberFilm));
        System.out.println("Genre: " + filmFavorite.get("Genre").get(numberFilm));
        System.out.println("Sinopsis: " + filmFavorite.get("Sinopsis").get(numberFilm));
        System.out.println("Cast: " + filmFavorite.get("Cast").get(numberFilm));

    }
    public static void addFilm(HashMap<String, ArrayList<String>> filmFavorite, Scanner scan2){
        scan2.nextLine();
        String judul;   String rilis;   String durasi;
        String genre;   String sinopsis;    String cast;

        System.out.println("Judul:"); judul = scan2.nextLine();
        System.out.println("Rilis:"); rilis = scan2.nextLine(); 
        System.out.println("Durasi:"); durasi = scan2.nextLine();
        System.out.println("Genre:"); genre = scan2.nextLine();
        System.out.println("Sinopsis:"); sinopsis = scan2.nextLine();
        System.out.println("Cast:"); cast = scan2.nextLine();

        filmFavorite.get("Judul").add(judul);
        filmFavorite.get("Rilis").add(rilis);
        filmFavorite.get("Durasi").add(durasi);
        filmFavorite.get("Genre").add(genre);
        filmFavorite.get("Sinopsis").add(sinopsis);
        filmFavorite.get("Cast").add(cast);
    }
    public static void removeFilm(int deleteNumberOfFilm, HashMap<String, ArrayList<String>> filmFavorite){
        filmFavorite.get("Judul").remove(deleteNumberOfFilm);
        filmFavorite.get("Rilis").remove(deleteNumberOfFilm);
        filmFavorite.get("Durasi").remove(deleteNumberOfFilm);
        filmFavorite.get("Genre").remove(deleteNumberOfFilm);
        filmFavorite.get("Sinopsis").remove(deleteNumberOfFilm);
        filmFavorite.get("Cast").remove(deleteNumberOfFilm);
    }
    public static String search(String input2, HashMap<String, ArrayList<String>> filmFavorite){
        ArrayList<String> judul = filmFavorite.get("Judul");
        String out = "hasil("+ input2 +")\n";
        for (int i = 0; i < judul.size(); i++) {
            String film = judul.get(i);
            for (int j = 0; j < film.length(); j++) {
                if(j+input2.length() <= film.length()){
                    if(input2.equalsIgnoreCase(film.substring(j,j+input2.length()))){
                        out += String.format(i+1 + "." +film + "\n");
                        break;
                    }

                }
                else{
                    continue;
                }
            }
        }
        return out;

    }
}
    

