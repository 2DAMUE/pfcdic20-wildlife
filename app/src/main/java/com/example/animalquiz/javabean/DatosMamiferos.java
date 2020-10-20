package com.example.animalquiz.javabean;

import com.example.animalquiz.R;

import java.util.ArrayList;

public class DatosMamiferos {
    private ArrayList<Mamiferos> listaMamiferos;

    public DatosMamiferos() {
        listaMamiferos = new ArrayList<Mamiferos>();

        rellenarLista();
    }

    private void rellenarLista() {

        listaMamiferos.add(new Mamiferos("Europa","Lince ibérico", R.drawable.linceiberico, R.drawable.iconoeuropa ,"Mammalia", "Macho 13 kgs / Hembra 9.4 kgs", "85 – 110 cms", "15 años", "Especialmente conejos, pero también pueden comer: anátidas, ungulados, perdices, pequeños mamíferos y otras aves",
                "NO", "se encuentra en el bosque y matorral mediterráneo, en zonas muy restringidas de la península ibérica.", R.raw.sonidolince));

        listaMamiferos.add(new Mamiferos("África","El león", R.drawable.leonfoto, R.drawable.iconoafrica ,"Mammalia", "Macho: 190 kgs (Adulto), Hembra: 130 kgs (Adulto)", "Macho: 1,7 – 2,5 m (Cabeza y cuerpo), Hembra: 1,4 – 1,8 m", "10 - 14 años", "Zebras, gacelas o jabalíes",
                "SI", "El territorio de sub Sahara de África.",  R.raw.sonidoleon));

        listaMamiferos.add(new Mamiferos("África","La hiena", R.drawable.hiena, R.drawable.iconoafrica ,"Mammalia", "44 – 64 kg", "95 – 170 cm", "12 años", "Se alimentan de animales muertos abandonados por otros carnívoros.",
                "SI", "África subsahariana. Sabana, matorrales y desierto.", R.raw.sonidohienas));

        listaMamiferos.add(new Mamiferos("Europa","Rebeco", R.drawable.rebeco, R.drawable.iconoeuropa ,"Mammalia", "Macho: 30 – 60 kg (Adulto), Hembra: 25 – 45 kg (Adulto)", "1,1 – 1,4 m", "Si está en libertad a" +
                "alcanzará los 17 años aprox.", "su dieta incluye pasto, plantas herbáceas, brotes, musgo e incluso gramíneas.",
                "NO", "Vive en zonas montañosas y bosques empinados ricos en brotes y grava.", 2));

        listaMamiferos.add(new Mamiferos("América del Norte","Oso grizzly", R.drawable.osogrizzly, R.drawable.iconoamericanorte ,"Mammalia", "Macho: 270 - 550 kg, Hembra: 130 – 200 kg (Adulto)", "1 - 2 m", "20 - 25 años", "un 85% basada en materia vegetal (bellotas, castañas, hayucos, avellanas, " +
                "bayas, megaforbios, tubérculos, brotes tiernos de gramíneas...), y la completa con carroñas, insectos, miel, setas, aves, huevos y ungulados.",
                "SI", "viven en el noroeste de Estados Unidos, Canadá y península de Kamchatka (Siberia).", 3));

        listaMamiferos.add(new Mamiferos("Africa","Jirafa", R.drawable.jirafa, R.drawable.iconoafrica ,"Mammalia", "Macho: un promedio de hasta 1192 kgs, Hembra: un promedio de hasta 828 kgs", "4,2 m", "En libertad llegan hasta los 25 años y en cautividad hasta los 35 años," +
                "ya que hay menos depredadores y reciben cuidados médicos", "se alimentan principalmente de árboles de acacia y Commiphora (mirra).",
                "NO", "Se la suele encontrar en: sabanas y bosques abundantes en vegetación.", R.raw.sonidojirafa ));

        listaMamiferos.add(new Mamiferos("Oceanía","Ornitorrinco", R.drawable.ornitorrinco, R.drawable.iconooceania ,"Mammalia", "Macho: 1 - 2,4 kgs, Hembra: 0,7 - 1,6 kgs", "Macho: hasta 50 cm, Hembra: hasta 43 cm", "Hasta 17 años en cautiverio", "Se basa en insectos acuáticos y sus larvas, crustáceos y moluscos acuáticos, lombrices de tierra o acuáticas, pequeños peces e incluso algunos recursos vegetales.",
                "NO", "Vive en el este de Australia y de la isla de Tasmania.", 5));

        listaMamiferos.add(new Mamiferos("América del Sur","Tamarino león dorado", R.drawable.tamarinoleondorado, R.drawable.iconoamericasur ,"Mammalia", "300 - 700 gramos.", "Hembra: hasta 25 cm, Macho: hasta 24 cm", "12 años", "es un animal omnívoro. Cuando se alimenta de vegetales, suele comer: " +
                "frutas, el néctar y las flores. Y cuando come animales escoge entre: aves, caracoles, reptiles, huevos y arañas.",
                "SI", "Vive en el oriente de Brasil, donde quedan unos 1000 individuos, ya que está en peligro de extinción", 6));

        listaMamiferos.add(new Mamiferos("Asia","Yak", R.drawable.yak, R.drawable.iconoasia ,"Mammalia", "Macho: 350 - 580 kgs, Hembra: 220 - 260 kgs", "2,5 - 3,3 m", "15 - 25 años", "Se alimentan de plantas bajas",
                "NO", "Vive en las altiplanicies esteparias y fríos desiertos del Nepal, Tíbet, Pamir y Karakórum, entre los 4000 y 6000 metros de altitud", 7));
    }

    public ArrayList<Mamiferos> getListaMamiferos(){
        return listaMamiferos;
    }
}
