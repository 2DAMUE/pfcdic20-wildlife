package com.example.animalquiz.javabean;

import com.example.animalquiz.R;

import java.util.ArrayList;

public class DatosPeces {
    private ArrayList<Peces> listaPeces;

    public DatosPeces() {
        listaPeces = new ArrayList<Peces>();

        rellenarLista();
    }

    private void rellenarLista() {

        listaPeces.add(new Peces("Europa","Barbo mediterráneo", R.drawable.barbomediterraneo, R.drawable.iconoeuropa ,"Chordata", "Puede llegar a pesar hasta 3,5 kg", "Hasta 60 cm de largo", "Puede vivir de 7-16 años", "Es un pez omnívoro, se alimenta de " +
                "larbas de insectos y también de algas",
                "NO", "Especie endémica de la Península Ibérica, se encuentra al sur del Ebro en los ríos Mijares, Palancia, Turia, Júcar, Bullent, Serpis, Vinalopó y Clariano"));

        listaPeces.add(new Peces("América del Norte","Pez Gato", R.drawable.pezgato, R.drawable.iconoamericanorte ,"Actinopterygii", "Puede llegar a pesar hasta 3,60 kgs, pero lo normal es que llegue a pesar 400 g", "Puede alcanzar los 60 cms, pero lo normal es que sean entre 25-35 cms", "8-20 años", "La dieta del pez gato se basa principalmente en insectos acuáticos, cangrejos de río, moluscos, crustáceos y peces más pequeños.",
                "NO", "Se puede encontrar en: el sur de Canadá, los distritos centrales de Estados Unidos, al norte de México"));

        listaPeces.add(new Peces("América del Sur","Piraña", R.drawable.pirana, R.drawable.iconoamericasur ,"Actinopterygii", "Puede llegar a pesar hasta los 3 kgs", "LLegar a tener hasta 40 cms de longitud", "Pueden llegar a vivir hasta 10 años, aunque en cautividad llegarían hasta los 30 años.", "Consiste, básicamente, en la carne de otros peces. También pueden alimentarse de" +
                "crustáceos, invertebrados de agua dulce, insectos e incluso trozos de carne cruda sin sal ni aditivos.",
                "Si", "Estos peces solo se encuentran en arroyos y ríos de agua dulce, principalmente en la cuenca del Amazonas, en América del Sur." +
                " Este es el hábitat natural de las pirañas salvajes, pero también son habituales en zonas como Brasil."));

        listaPeces.add(new Peces("Asia","Carpa plateada", R.drawable.carpaplateada, R.drawable.iconoasia ,"Actinopterygii", "Su peso suele rondar los 9 kgs", "Alcanzan una longitud de 60-90 cms", "Pueden llegar a vivir hasta 20 años", "se alimenta de fitoplancton, zooplancton y detritos (Los detritos son la descomposición de la materia prima)",
                "NO", "La carpa plateada es una especie de agua dulce que vive en condiciones de temperatura de entre (6-28 °C) y su distribución natural es en Asia."));

        listaPeces.add(new Peces("Oceanía","Dragón de mar", R.drawable.dragondemar, R.drawable.iconooceania ,"Actinopterygii", "Sin datos", "Puede llegar a medir unos 30 cms, aunque hay algunos que miden 35 cms", "En cautividad llegan a vivir hasta 9 años, pero en libertad no hay datos exactos.", "El dragón de mar foliáceo se alimenta de plancton, pequeños crustáceos como anfípodos y camarones mísidos y peces larvales. " +
                "Al igual que el caballito de mar, no tiene dientes y succiona los alimentos por su boca en forma de tubo.",
                "NO", "Habitan en los arrecifes coralinos y rocosos y en las praderas de plantas y algas marinas de las costas del sur de Australia."));

        listaPeces.add(new Peces("Africa","Tilapia", R.drawable.tilapia, R.drawable.iconoafrica ,"Actinopterygii", "Puede llegar a pesar hasta 2 kgs", "Puede llegar a tener de 13-20 cms de longitud.", "Sin datos", "Cuando son adultos se alimentan de: Algas, bacterias, detritus, lenteja de agua, otras plantas",
                "Territorial y agresivo", "Son peces de aguas cálidas, que viven tanto en agua dulce como salada e incluso pueden acostumbrarse a aguas poco oxigenadas."));
    }

    public ArrayList<Peces> getListaPeces(){
        return listaPeces;
    }
}
