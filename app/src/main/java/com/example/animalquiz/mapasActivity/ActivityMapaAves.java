package com.example.animalquiz.mapasActivity;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.animalquiz.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ActivityMapaAves extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_aves);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng aguila = new LatLng(39.8952029, -4.498363);
        mMap.addMarker(new MarkerOptions().position(aguila).title("Aguila Iberica").snippet(" solo habita en la Península Ibérica, principalmente en España. ...")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));


        LatLng perdiz = new LatLng(38.959751, -3.8828465);
        mMap.addMarker(new MarkerOptions().position(perdiz).title("Perdiz Roja").snippet("Habita principalmente en las llanuras sin desdeñar el monte bajo, zonas boscosas o terrenos de cultivo. En las montañas, podemos encontrarla hasta a 1.000 metros de altitud")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));


        LatLng aga = new LatLng(22.5000485, -100.0000375);
        mMap.addMarker(new MarkerOptions().position(aga).title("Agachadiza Americana").snippet("es un ave limícola de la familia Scolopacidae. Se distribuye por toda América del Norte: México, Canadá y Estados Unidos.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));

        LatLng horne = new LatLng(-10.3333333, -53.2);
        mMap.addMarker(new MarkerOptions().position(horne).title("Hornero").snippet(" Habita el este, centro y sur de Brasil")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));

        LatLng grulla = new LatLng(36.5748441, -139.2394179);
        mMap.addMarker(new MarkerOptions().position(grulla).title("Grulla De Manchuria").snippet(" Vive en praderas y altos valles con áreas pantanosas, donde la altura constituye una ventaja natural")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));

        LatLng verd = new LatLng(43.1595664, -4.0878382);
        mMap.addMarker(new MarkerOptions().position(verd).title("Verderon Serrano").snippet(" presente únicamente en algunos países de Europa Occidental y del que la península Ibérica alberga a casi el 90% de la población total de la especie")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));

        LatLng cordenal = new LatLng(52.7077209, -88.5419171);
        mMap.addMarker(new MarkerOptions().position(cordenal).title("cordenal").snippet("El cardenal norteño es un pájaro cantor de tamaño medio con una longitud corporal de 21-23 cm.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));

        LatLng condor = new LatLng(-32.8336867, -70.5981609);
        mMap.addMarker(new MarkerOptions().position(condor).title("Condor").snippet("se extiende por toda la cordillera de los andes y en cordilleras cercanas al océano pacífico y atlántico")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));

        LatLng faisan = new LatLng(35.000074, 104.999927);
        mMap.addMarker(new MarkerOptions().position(faisan).title("Faisan De Corona Blanca").snippet("Este es un animal que únicamente existe en China. Su hábitat natural suelen ser los bosques presentes en las montañas.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));

        LatLng casu = new LatLng(-24.7761086, 134.755);
        mMap.addMarker(new MarkerOptions().position(casu).title("Casuaria").snippet("Estos animales viven en las selvas tropicales de Australia y Nueva Guinea y está catalogada como la segunda ave más grande en el mundo después del avestruz.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));

        LatLng secre = new LatLng(20.6496576, -100.38218);
        mMap.addMarker(new MarkerOptions().position(secre).title("Pajaro secretario").snippet("Está ampliamente extendido en África al sur del Sahara.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pajarados)));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(aguila));
    }
}
