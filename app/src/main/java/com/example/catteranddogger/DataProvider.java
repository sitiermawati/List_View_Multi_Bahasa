package com.example.catteranddogger;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.catteranddogger.model.Elephant;
import com.example.catteranddogger.model.Animal;
import com.example.catteranddogger.model.Lion;
import com.example.catteranddogger.model.Tiger;

public class DataProvider {
    private static List<Animal> animals = new ArrayList<>();

    private static List<Tiger> theDataTiger(Context ctx) {
        List<Tiger> tigers = new ArrayList<>();
        tigers.add(new Tiger("Harimau Sumatra", "Panthera tigris sondaica",
                "Harimau Sumatra yang mendiami pulau Sumatra, Indonesia dan satu-satunya anggota subspesies harimau sunda yang masih bertahan hidup hingga saat ini", R.drawable.tiger_sumatra));
        tigers.add(new Tiger("Harimau Malaya", "Panthera tigris tigris",
                "Subspesies dari harimau ini ditemui di bagian pantai timur Semenanjung Malaysia dan kini terdapat 250 hingga 340 ekor pada 2013, membuatnya sebagai populasi macan terbesar selain harimau benggala dan harimau indocina ", R.drawable.tiger_malaya));
        tigers.add(new Tiger("Harimau siberia", " Panthera tigris altaica",
                "Subspesies harimau yang habitatnya berada di wilayah Amur di Timur Jauh dan berstatus dilindungi, Harimau siberia dianggap sebagai subspesies terbesar dari enam subspesies harimau.", R.drawable.tiger_siberia));
        tigers.add(new Tiger("Harimau Indocina", "Panthera tigris tigris",
                "Subspesies harimau yang habitatnya di Kamboja, Tiongkok, Laos, Burma, Thailand, dan Vietnam", R.drawable.tiger_indocina));
        tigers.add(new Tiger("Harimau Benggala", "Panthera tigris tigris",
                "Harimau benggala (bahasa Latin: Panthera tigris tigris, sebelumnya Panthera tigris bengalensis) adalah subspesies harimau di India, Bangladesh, Nepal, dan Bhutan", R.drawable.tiger_benggala));
        tigers.add(new Tiger("Harimau Tiongkok Seletan", "Panthera tigris amoyensis",
                "Harimau tiongkok selatan merupakan spesies paling kritis dari semua subspesies harimau", R.drawable.tiger_tingkokselatan));
        return tigers;
    }

    private static List<Lion> theDataLion(Context ctx) {
        List<Lion> lions = new ArrayList<>();
        lions.add(new Lion("Singa Berber", "Panthera leo leo",
                "Singa berber dulunya berhabitat di Afrika Utara, dari Moroko sampai Mesir. Subspesies ini merupakan salah satu yang terbesar, ditandai dengan surai besar dan suburnya", R.drawable.singa_barbary));
        lions.add(new Lion("SInga Afrika Barat", "Panthera leo senegalensis",
                "Subspesies singa afrika barat ini hidup dalam kawanan dan berukuran sekitar 3 meter, termasuk ekornya", R.drawable.singa_afrika_barat));
        lions.add(new Lion("Singa Kongo", "Panthera leo azandica",
                "Subspesies singa yang tersebar di sepanjang dataran benua Afrika, terutama di Uganda dan Republik Kongo", R.drawable.singa_kongo));
        lions.add(new Lion("SInga Transvaal", "Panthera leo krugeri",
                "Singa Transvaal, berasal dari Afrika Selatan. Singa Afrika ini adalah varietas dari bagian selatan Afrika dan dianggap sebagai saudara singa Katanga", R.drawable.singa_transvaal));
        lions.add(new Lion("Singa Katanga", "Panthera leo bleyenberghi",
                "Singa Kantaga menonjol karena karakteristik surai berwarna pasir dan tebalnya yang mengesankan. Bagian terluar surai ini dapat muncul dalam kombinasi warna kopi cokelat muda", R.drawable.singa_katanga));
        lions.add(new Lion("Singa Afrika Timur", "Panthera leo nubica",
                "Singa Afrika Timur memilik bobot tubuhnya sama dengan spesies singa pada umumnya, yaitu antara 150 hingga 200 kg. Pejantan dari subspesies ini memiliki surai yang lebih banyak dan lebih gelap daripada subspesies singa lainnya", R.drawable.singa_afrika_timur));
        return lions;
    }

    private static List<Elephant> theDataElephant(Context ctx){
        List<Elephant> elephants = new ArrayList<>();
        elephants.add(new Elephant("Gajah Hutan Afrika", "Loxodonta cyclotis",
                "Gajah hutan Afrika lebih gelap dan lebih kecil dari rekan sabana mereka. Mandibula lebih sempit, dan gading lebih kuat dan lebih lurus dari spesies sabana. Taring yang kuat, terkadang sampai ke tanah, digunakan untuk mendorong menembus semak belukar habitat gajah", R.drawable.gajah_hutan_afrika));
        elephants.add(new Elephant("Gajah Savannah Afrika", "Loxodonta africana",
                "Gajah ini adalah hewan darat terbesar dan terberat. Telinga mereka yang sangat besar yang digunakan untuk memancarkan panas berlebih adalah salah satu karakteristik mereka yang paling berbeda ", R.drawable.gajah_savannah_afrika));
        elephants.add(new Elephant("Gajah India", "Elephas maximus indicus",
                "Salah satu dari tiga subspesies gajah Asia yang memiliki 19 pasang tulang rusuk. Kulit gajah India lebih terang dari gajah Sri Lanka tetapi lebih gelap dari subspesies Sumatra ",R.drawable.gajah_india));
        elephants.add(new Elephant("Gajah Sumatera", "Elephas maximus sumatranus",
                "Berasal dari pulau Sumatra adalah subspesies dari gajah Asia. Gajah memiliki 20 pasang iga dan berbeda dari dua subspesies gajah Asia lainnya yang memiliki warna kulit lebih terang", R.drawable.gajah_sumatera));
        elephants.add(new Elephant("Gajah Kalmantan", "Elephas maximus borneensis",
                "Gajah Kalimantan disebut sebagai “gajah kerdil” tidak ada perbedaan ukuran yang signifikan, telah ditemukan antara gajah ini dan gajah di Semenanjung Malaysia. Namun, gajah Kalimantan sangat jinak dan pasif, indikasi lain bahwa gajah ini berasal dari stok domestik", R.drawable.gajah_kalimantan));
        elephants.add(new Elephant("Gajah Sru Lanka", "Elephas maximus maximus",
                "Gajah ini adalah yang terbesar di antara subspesies gajah Asia yang memiliki 19 pasang iga. Bercak depigmentasi pada kulit mereka lebih berbeda daripada yang lainnya. Hanya 7% dari gajah jantan Sri Lanka yang membawa gading", R.drawable.gajah_sri_lanka));
        return elephants;
    }

    private static void initAllHewans(Context ctx) {
        animals.addAll(theDataTiger(ctx));
        animals.addAll(theDataLion(ctx));
        animals.addAll(theDataElephant(ctx));
    }

    public static List<Animal> getAllHewan(Context ctx) {
        if (animals.size() == 0) {
            initAllHewans(ctx);
        }
        return animals;
    }

    public static List<Animal> getHewansByTipe(Context ctx, String jenis) {
        List<Animal> hewansByType = new ArrayList<>();
        if (animals.size() == 0) {
            initAllHewans(ctx);
        }
        for (Animal h : animals) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
