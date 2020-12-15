package com.example.animalquiz.javabean;

import com.example.animalquiz.R;

import java.util.ArrayList;

public class DatosAnfibios {
    private ArrayList<Anfibios> listaAnfibios;

    public DatosAnfibios() {
        listaAnfibios = new ArrayList<Anfibios>();

        rellenarLista();
    }

    private void rellenarLista() {

        listaAnfibios.add(new Anfibios("Europa","Salamandra común", R.drawable.salamandracomun, R.drawable.iconoeuropa ,"Anfibio", "LLega hasta los 19 g", "Suele estar en torno a los 200 mm pero también puede llegar a los 250 mm", "Vive unos 58 años pero en cautividad llega hasta los 70", "las salamandras terrestres les encantan los bichos bola, los escarabajos, las lombrices," +
                " los ciempiés pequeños, los pulgones, las palomillas y otros insectos voladores nocturnos.",
                "NO", "Se distribuye a lo largo de Europa, desde Portugal a Italia y Grecia hasta el norte de Alemania, sur de Polonia y Rumanía."));

        listaAnfibios.add(new Anfibios("América del Norte","Hyla avivoca", R.drawable.hylaavivoca, R.drawable.iconoamericanorte ,"Anfibio", "", "2.8 to 5.2 cm", "6 años aprox.", "Hervíboros. Comen hojas o vegetales",
                "Si", "Habita en el este de los Estados Unidos y el sureste de Canadá."));

        listaAnfibios.add(new Anfibios("América del Sur","Rana arlequín", R.drawable.ranaarlequin, R.drawable.iconoamericasur ,"Anfibios", "Puede llegar a pesar hasta 3 kgs", "Llega a medir hasta 33 cm", "No llegan a vivir 10 años", "Se alimenta de pequeños invertebrados, " +
                "principalmente hormigas, termitas, escarabajos pequeños, y otros artrópodos que se encuentren en la hojarasca.",
                "Si", "Durante el día se le puede encontrar en rocas y troncos cerca de ríos y quebradas, de noche se refugia en plantas de poca altura o en grietas."));

        listaAnfibios.add(new Anfibios("Oceanía ","Rana Corroboree", R.drawable.ranacorroboree, R.drawable.iconooceania ,"Anfibio", "Sin datos", "2,5 - 3 cm.", "6 años aprox.", "Su dieta se basa en: escarabajos, ácaros, hormigas y larvas de insectos. Sin embargo, como renacuajos que también tienden a comer " +
                "algas y otros pequeños trozos de material orgánico que se encuentra en sus piscinas.",
                "NO", "Es endémica de Australia y sólo se encuentra dentro de la zona del Parque Nacional Kosciusko en las Montañas Nevadas en Nueva Gales del Sur."));

        listaAnfibios.add(new Anfibios("Africa","Rana Goliat", R.drawable.ranagoliat, R.drawable.iconoafrica ,"Anfibio", "Alcanza un peso de unos 3 kgs", "Con las patas estiradas llega a medir 80cm", "Puede llegar a vivir 15 años en estado salvaje", "Suele comer insectos, gusanos, crustáceos, langostas, peces," +
                " moluscos, pequeñas serpientes, tortugas, salamandras y hasta otras especies de ranas más pequeñas.",
                "Si", "En su hábitat natural, suelen demostrar clara predilección por los bosques húmedos y densos."));
    }

    public ArrayList<Anfibios> getListaAnfibios(){
        return listaAnfibios;
    }
}
