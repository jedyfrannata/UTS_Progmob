package com.example.granat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataGranat {
    private static String [] namagranat = {
            "GrAnaT 2015",
            "GrAnaT 2016",
            "GrAnaT 2017",
            "GrAnaT 2018",
            "GrAnaT 2019",

    };

    private static String [] detailgranat = {
            "GrAnaT 2015 bertemakan Evolution of Golden Age yang diselenggarakan di Lapangan Lumintang pada tanggal 12 September 2015 yang mengundang banyak band besar salah satunya yaitu The Dissland.",
            "GrAnaT 2016 bertemakan Scream for Unity yang diselenggarakan di Lapangan Serangan yang pada tanggal 24 September 2016 yang mengundang banyak band besar salah satunya adalah Nvicula.",
            "GrAnaT 2017 bertemakan Unstoppable yang diselenggarakan di Parkir Gor Barat Ngurah Rai pada tanggal 16 September 2017 yang mengundang banyak band besar salah satunya yaitu Natterjack.",
            "GrAnaT 2018 bertemakan Symphony of Divergency yang diselenggarakan di Lapangan Parkir Barat Gor Ngurah Rai pada tanggal 16 Sepetember 2018 yang mengundang banyak band besarsalah satunya Turbidity band yang berasal dari Bandung. ",
            "GrAnaT 2019 bertemakan Recaka Patala yang diselenggarakan di Lapangan Segara Perancak pada tanggal 21 September 2019 yang mengundang banyak band besar salah satunya yaitu Fraud.",
    };

    private static int[] gambargranat = {
            R.drawable.granat15,
            R.drawable.granat16,
            R.drawable.granat17,
            R.drawable.granat18,
            R.drawable.granat19,
    };

    static ArrayList<Granat> getListdata(){
        ArrayList<Granat> list = new ArrayList<>();
        for (int position = 0; position <namagranat.length; position++) {
            Granat granat = new Granat();
            granat.setNama(namagranat[position]);
            granat.setDetail(detailgranat[position]);
            granat.setPhoto(gambargranat[position]);
            list.add(granat);
        }
        return list;
    }


}