package com.java;

public class Selam {

    private String world = "millet";

    public String selamSoyle(String kime){
        String cumle;

        if(kime != ""){
            cumle = "Selam" + kime;
        }else {
            cumle = "Selam" + world;
        }
        return cumle; 
    }

    public String selamiAl(){
      String don =   selamSoyle("burak");
        return  don;
    }

    public static void main(String[] args) {
        Selam selam = new Selam();
        String cevap = selam.selamSoyle("Burak");
        System.out.println(cevap);
        System.out.println("--------------");
        String cevap1 = selam.selamiAl();
        System.out.println(cevap1);
    }

}
