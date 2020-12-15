package com.example.animalquiz.javabean;

import com.example.animalquiz.R;

import java.util.ArrayList;

public class DatosReptiles {
    private ArrayList<Reptiles> listaReptiles;

    public DatosReptiles() {
        listaReptiles = new ArrayList<Reptiles>();

        rellenarLista();
    }

    private void rellenarLista() {

        listaReptiles.add(new Reptiles("Europa","Galápago leproso", R.drawable.galapagoleproso, R.drawable.iconoeuropa ,"Reptilia", "¿?", "Suelen medir 100 - 180 mm pero pueden llegar a 200 mm", "Su media de vida es de 20 años", "Las tortugas más jóvenes tienden a ser carnívoras. (comen más proteína animal), y cuando crecen se vuelven más herbívoras. Cuando son menores de 3 años, necesitan muchas proteínas pues están" +
                " en una etapa crucial de su crecimiento. Suelen alimentarse de grillos, caracoles de agua, gambusia, lombrices de tierra y otros pequeños animales.",
                "NO", "Común sobre todo en el sur de España. Vive en masas de agua dulce como ríos o pantanos."));

        listaReptiles.add(new Reptiles("América del Norte","Serpiente del lodo", R.drawable.serpientedellodo, R.drawable.iconoamericanorte ,"Reptilia", "Sin datos", "1 - 1,4 metros, aunque puede llegar a los 2 metros.", "6 años aprox.", "Se alimenta principalmente de salamandras acuáticas, también come otros anfibios",
                "NO", "se encuentra principalmente en el sureste de Estados Unidos. Habita en las orillas de arroyos y pantanos, entre la vegetación densa o bajo desechos del suelo. " +
                "Es casi totalmente acuática y rara vez sale del agua, excepto para poner huevos, hibernar o durante la sequía para escapar de la sequía en su hábitat."));

        listaReptiles.add(new Reptiles("América del Sur","Boa constrictor", R.drawable.boaconstrictor, R.drawable.iconoamericasur ,"Reptilia", "Machos: Alcanzan un peso de hasta 45 kgs Hembras: 10 – 15 kg", "Macho: Puede llegar a medir hasta 4 metros Hembra 4 - 6 metros", "Es raro que vivan más de 20 años en libertad, en cautiverio pueden llegar" +
                "a vivir hasta 40 años", "Su dieta se compone de grandes lagartos y de animales de sangre caliente, como aves y pequeños mamíferos.",
                "Si", "Habita desde todo el norte de Brasil, Guyana, Surinam, Guayana Francesa, Venezuela, centro y sur de Colombia, este de Ecuador, este de Perú, hasta el norte de Bolivia."));

        listaReptiles.add(new Reptiles("Asia","Krait rayado", R.drawable.kraitrayada, R.drawable.iconoasia ,"Reptilia", "Sin datos", "1 - 2 metros", "6 años aprox.", "Se alimentan principalmente de otras serpientes e incluso otras serpientes venenosas.",
                "Si", "Se encuentran en el subcontinente indio, incluyendo Sri Lanka y el este de Pakistán, y en el Sureste Asiático, incluyendo Indonesia y Borneo."));

        listaReptiles.add(new Reptiles("Oceanía","Diablo espinoso", R.drawable.diabloespinoso, R.drawable.iconooceania ,"Reptilia", "Macho: Entorno a los 49 gramos Hembra: Puede llegar a pesar 45,5 gramos", "Macho: 9 - 10 cm Hembra: 8 - 20 cm", "Pueden llegar a vivir hasta 20 años, esto es debido a los pocos depredadores que los coman.", "Se alimenta únicamente de hormigas",
                "NO", "El diablo espinoso suele habitar las llanuras, y se encuentra cerca de matorrales de suelos arenosos, nunca rocosos o duros. Principalmente, los diablos espinosos se encuentran al oeste y al norte del Gran Desierto."));

        listaReptiles.add(new Reptiles("Africa","Mamba negra", R.drawable.mambanegra, R.drawable.iconoafrica ,"Mammalia", "0,5 - 2,4 kgs", "El promedio es de 2,5 metros, aunque pueden llegar a tener 4,5 metros de longitud", "Viven aproximadamente unos 11 años", "Se alimenta principalmente de mamíferos, aves y reptiles de pequeño tamaño.",
                "Es una serpiente muy territorial, se recomienda que si alza la cabeza usted se eche atrás lo más rápido posible", "Prefiere ambientes moderadamente secos como bosques poco densos y de matorrales, zonas rocosas y sabanas semiáridas. También habita en sabanas húmedas y bosques de tierras bajas."));
    }

    public ArrayList<Reptiles> getListaReptiles(){
        return listaReptiles;
    }
}
