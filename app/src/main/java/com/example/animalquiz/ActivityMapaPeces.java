package com.example.animalquiz;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ActivityMapaPeces extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_peces);
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

        LatLng barbo = new LatLng(42.0061574, -1.5047512);
        mMap.addMarker(new MarkerOptions().position(barbo).title("Barbo Mediterraneo").snippet("Se encuentra al sur del Ebro en los ríos Mijares, Palancia, Turia, Júcar, Bullent, Serpis, Vinalopó y Clariano")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pez)));

        LatLng gato = new LatLng(9.5506, 122.5164);
        mMap.addMarker(new MarkerOptions().position(gato).title("Pez Gato").snippet("Estos peces se caracterizan por alimentarse en la noche, se encuentran por lo general en el fondo de las aguas que no son tan profundas")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pez)));

        LatLng pir = new LatLng(-21.0002179, -61.0006565);
        mMap.addMarker(new MarkerOptions().position(pir).title("Piraña").snippet("viven en los ríos de aguas templado-cálidas y cálidas de Sudamérica")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pez)));


        LatLng carpa = new LatLng(51.2086975, 89.2343748);
        mMap.addMarker(new MarkerOptions().position(carpa).title("Carpa Plateada").snippet("La carpa plateada es una especie de agua dulce que vive en condiciones temperadas (6-28 °C) y su distribución natural es en Asia.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.pez)));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(barbo));
    }
}
