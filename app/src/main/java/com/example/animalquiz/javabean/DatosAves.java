package com.example.animalquiz.javabean;

import com.example.animalquiz.R;

import java.util.ArrayList;

public class DatosAves {
    private ArrayList<Aves> listaAves;

    public DatosAves() {
        listaAves = new ArrayList<Aves>();

        rellenarLista();
    }

    private void rellenarLista() {

        listaAves.add(new Aves("Europa","Águila imperial ibérica", R.drawable.aguilaimperial, R.drawable.iconoeuropa, "Aves", "530 g",
                "72 - 83 cm", "20 años en libertad, 41 en cautividad", "Cualquier animal que pese 3 kgs. Sobre todo conejos, ardillas y liebres",
                "NO", "Península Ibérica. Sus hábitats idóneos son las áreas de bosque esclerófilo típicamente mediterráneo"));

        listaAves.add(new Aves("Europa","Perdiz roja", R.drawable.perdizroja, R.drawable.iconoeuropa ,"Aves", "400 - 500 g",
                "34-39 cm", "6 años aprox.", "Cuando es adulto/a se alimenta de: " +
                "semillas, frutos, hojas, raíces y flores (también se puede alimentar de insectos y líquenes)",
                "NO", "Se encuentra en la Península Ibérica, en el sur de Francia y en el noroeste de Italia"));

        listaAves.add(new Aves("América del norte","La agachadiza americana", R.drawable.agachadizaamericana, R.drawable.iconoamericanorte ,"Aves",
                "140 - 230 g", "25 – 31 cm", "8 años aprox. (en libertad)", "Particularmente lombrices de tierra.",
                "NO", "Se encuentra en América del norte."));

        listaAves.add(new Aves("América del sur","Hornero", R.drawable.hornero, R.drawable.iconoamericasur ,"Aves", "31 - 65 g", "16 - 23 cm",
                "Un estudio demostró que pueden vivir de 3 - 4 años, aunque también puede llegar a 8 años", "Se alimenta pricipalmente de insectos" +
                ",arañas y semillas", "NO", "Se encuentra en América del sur, donde se distribuyen desde el norte de Colombia y Venezuela hasta el norte de la Patagonia en Argentina"));

        listaAves.add(new Aves("Asia","Grulla de Manchuria", R.drawable.grullamanchuria, R.drawable.iconoasia ,"Aves", "8 - 10 kgs", "1,6 m y 2,4 m con las alas extendidas",
                "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));

        listaAves.add(new Aves("Europa","Verderon serrano", R.drawable.verderonserrano, R.drawable.iconoeuropa ,"Aves",
                "Su peso puede llegar hasta los 15 g", "Unos 12 cm de longitud", "1 - 2 años ", "El alimento del verderón serrano consiste en una variedad considerable de semillas, así como de hojas herbáceas. Aunque su fuente de alimento son las semillas de algunos árboles, la mayoría de pinos, en ocasiones también se alimenta de algunos insectos.",
                "NO", "Estas aves se pueden localizar en la Selva Negra, en Alemania, así como en la zona central de Francia y también en la zona montañosa de la península ibérica. "));

        listaAves.add(new Aves("América del Norte","Cardenal", R.drawable.cardenal, R.drawable.iconoamericanorte ,"Aves", "Aproximadamente unos 43 g",
                "21 - 24 cm", "En libertad: pueden llegar hasta " +
                "15 años y 9 meses, En cautiverio: pueden llegar hasta los 28 años y 5 meses", "Se alimenta de semillas de plantas",
                "NO", "Habita desde el sur de Canadá hasta el norte de Guatemala y Belice, pasando por la parte oriental de los Estados Unidos desde Maine hasta Texas y por México. " +
                "Se le puede encontrar en bosques, jardines y pantanos."));

        listaAves.add(new Aves("América del Sur","Cóndor", R.drawable.condor, R.drawable.iconoamericasur ,"Ave", "11 - 15 kgs", "100 – 130 cm adulto",
                "50 - 60 años, aunque en ocasiones puede llegar a vivir hasta 70 años", "Se alimenta principalmente de carroña, aunque se dice que también se alimenta de ganado como ovejas en épocas de escasez.",
                "NO", "El cóndor andino habita las montañas costeras y los tipos de hábitats de montaña en la cordillera de los Andes de América del Sur. Esta especie ha sido localizada en alturas de hasta 5.500 m." +
                " Prefiere zonas de amplios espacios abiertos, lo que le ayuda a detectar alimentos."));

        listaAves.add(new Aves("Asia","Faisán de corona blanca", R.drawable.faisancoronablanca, R.drawable.iconoasia ,"Aves", "Machos: 0,3 - 1,2 kgs Hembras: 0,3 - 0,9 kgs",
                "Puede llegar a alcanzar los 80 cms de longitud", "Sin datos", "Su alimentación se basa principalmente en granos, insectos, semillas, lombrices raíces y bayas.",
                "NO", "Su área de distribución original se extiende desde el mar Negro y el Caspio hasta China."));

        listaAves.add(new Aves("Oceanía","Casuario", R.drawable.casuario, R.drawable.iconooceania ,"Aves", "Llega a pesar hasta 70 kgs",
                "1 - 1,7 m de longitud", "40 - 60 años", "se alimenta de frutos que caen al suelo, pero también pueden comer caracoles, setas o incluso pequeños mamíferos muertos que se encuentre.",
                "NO", "Estos animales viven en las selvas tropicales de Australia y Nueva Guinea y está catalogada como la segunda ave más grande en el mundo después del avestruz."));

        listaAves.add(new Aves("África","Pájaro Secretario", R.drawable.pajarosecretario, R.drawable.iconoafrica ,"Aves",
                "Pueden llegar a pesar hasta 3,3 kgs", "Puede llegar a medir hasta 1,50 metros de longitud", "Viven 10 - 15 años en libertad, pero pueden lleagar a vivir 19 - 20 años en cautividad.", "se alimenta de liebres, serpientes, ratones, insectos, tortugas, aves pequeñas, otros vertebrados y huevos." +
                " Es un pájaro diurno y, a diferencia de otras aves, caza desde el suelo.",
                "NO", "El pájaro secretario habita en sabanas, estepas y praderas.Tiene una buena capacidad de vuelo y anida en la copa de los árboles, pero es un ave principalmente terrestre."));
    }

    public ArrayList<Aves> getListaAves(){
        return listaAves;
    }
}
