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
                "72 - 83 cm", "20 años en libertad, 41 en cautividad", "Cualqioer animal que pese 3 kgs.Sobre todo conejos, ardillas y liebres",
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
                "Su peso puede llegar hasta los 15 g", "Unos 12 cm de longitud", "¿?", "así como de hojas herbáceas. ... Aunque su fuente de alimento son las semillas de algunos árboles," +
                " la mayoría de pinos, en ocasiones también se alimenta de algunos insectos.",
                "NO", "Vive en las zonas montañosas o sierras, entorno a los 600-700 m."));

        listaAves.add(new Aves("América del Norte","Cardenal", R.drawable.cardenal, R.drawable.iconoamericanorte ,"Aves", "Aproximadamente unos 43 g",
                "21 - 24 cm", "En libertad: pueden llegar hasta " +
                "15 años y 9 meses, En cautiverio: pueden llegar hasta los 28 años y 5 meses", "Se alimenta de semillas de plantas",
                "NO", "Habita desde el sur de Canadá hasta el norte de Guatemala y Belice, pasando por la parte oriental de los Estados Unidos desde Maine hasta Texas y por México. " +
                "Se le puede encontrar en bosques, jardines y pantanos."));

        listaAves.add(new Aves("América del Sur","Cóndor", R.drawable.condor, R.drawable.iconoamericasur ,"Aves", "8 - 10 kgs", "1,6 m y 2,4 m con las alas extendidas",
                "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));

        listaAves.add(new Aves("Asia","Faisán de corona blanca", R.drawable.faisancoronablanca, R.drawable.iconoasia ,"Aves", "8 - 10 kgs",
                "1,6 m y 2,4 m con las alas extendidas", "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));

        listaAves.add(new Aves("Oceanía","Casuario", R.drawable.casuario, R.drawable.iconooceania ,"Aves", "8 - 10 kgs",
                "1,6 m y 2,4 m con las alas extendidas", "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));

        listaAves.add(new Aves("África","Pájaro Secretario", R.drawable.pajarosecretario, R.drawable.iconoafrica ,"Aves",
                "8 - 10 kgs", "1,6 m y 2,4 m con las alas extendidas", "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));

        listaAves.add(new Aves("África","Prueba pajaro 1", R.drawable.pajarosecretario, R.drawable.iconoafrica ,"Da igual 1",
                "8 - 10 kgs", "1,6 m y 2,4 m con las alas extendidas", "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));

        listaAves.add(new Aves("África","Prueba pajaro 2", R.drawable.pajarosecretario, R.drawable.iconoafrica ,"da igual 2",
                "8 - 10 kgs", "1,6 m y 2,4 m con las alas extendidas", "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));

        listaAves.add(new Aves("África","Prueba pajaro 3", R.drawable.pajarosecretario, R.drawable.iconoafrica ,"da igual 3",
                "8 - 10 kgs", "1,6 m y 2,4 m con las alas extendidas", "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));

        listaAves.add(new Aves("África","Prueba pajaro 4", R.drawable.pajarosecretario, R.drawable.iconoafrica ,"da igual 4",
                "8 - 10 kgs", "1,6 m y 2,4 m con las alas extendidas", "50 - 60 años (Se la conoce como la grulla inmortal)", "Ratones, ranas e insectos grandes, y también semillas y hojas",
                "NO", "Se encuentra en Asia. Vive en praderas y altos valles con áreas pantanosas"));
    }

    public ArrayList<Aves> getListaAves(){
        return listaAves;
    }
}
