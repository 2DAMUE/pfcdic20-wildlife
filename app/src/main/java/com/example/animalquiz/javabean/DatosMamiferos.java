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

        listaMamiferos.add(new Mamiferos("América del Sur","Jaguar", R.drawable.jaguar, R.drawable.iconoamericasur ,"Mammalia", "de 45 a más de 150 kg", "1 - 70 a 2 - 30 m", "12 – 15 años (En libertad)", "Se alimentan de peces, tortugas e incluso Caimanes",
                "SI", "Habita desde lugares casi desérticos como el Desierto de Arizona o el altiplano mexicano hasta selvas tropicales como el Amazonas.", 7));

        listaMamiferos.add(new Mamiferos("Asia","Tigre de Bengala", R.drawable.tigrebengala, R.drawable.iconoasia ,"Mammalia", "180 - 250 kgs", "Macho: 270-310 cm(adulto), Hembra: 240-265 cm(adulto)", "12 – 15 años (En libertad)", "Animal carnívoro, su dieta es bastante variada" +
                " pero se suele alimentar de grandes Ungulados, jabalíes(con frecuencia) y entre presas de pequeño tamaño se encuentran: las liebres. puercoespines y los pavos reales",
                "SI", "Casi un tercio de la población mundial de estos grandes felinos habita en la India y Bangladés.Habitan en los parques nacionales de estos países como 'Sundarbans' y 'Ranthambore'", 7));

        listaMamiferos.add(new Mamiferos("Europa","Oso pardo", R.drawable.osopardo, R.drawable.iconoeuropa ,"Mammalia", "Macho: Alrededor de los 450 kgs, Hembra: Alrededor de los 250 kgs", "1,5 - 3 metros", "Viven una media de 25 años en estado salvaje", "Es un animal omnívoro con predominio vegetal, su alimento preferido son los panales de miel pero cuando aparecen los salmones" +
                " en los ríos se convierten en perscadores",
                "SI", "Habita desde lugares casi desérticos como el Desierto de Arizona o el altiplano mexicano hasta selvas tropicales como el Amazonas.", 7));
    }

    public ArrayList<Mamiferos> getListaMamiferos(){
        return listaMamiferos;
    }
}
