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

public class ActivityMapaAnfibios extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_anfibios);
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

        LatLng sala = new LatLng(-28.7362522, -52.8406334);
        mMap.addMarker(new MarkerOptions().position(sala).title("Salamandra Comun").snippet("salamandras se encuentran en el norte de América y también en la zona norte de Sur América.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rana)));

        LatLng hyla = new LatLng(20.6240398, -105.2224511);
        mMap.addMarker(new MarkerOptions().position(hyla).title("Hyla Avivoca").snippet("es una especie de anfibios de la familia Hylidae. Habita en el este de los Estados Unidos y el sureste de Canadá..")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rana)));

        LatLng arle = new LatLng(-1.3397668, -79.3666965);
        mMap.addMarker(new MarkerOptions().position(arle).title("Rana Arlequin").snippet(" es una especie de anfibio que se encuentra en los bosques tropicales húmedos de la región del Pacífico")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rana)));

        LatLng corro = new LatLng(33.058, -89.58956);
        mMap.addMarker(new MarkerOptions().position(corro).title("Rana corroboree").snippet("Australia y sólo se encuentra dentro de la zona del Parque Nacional Kosciusko en las Montañas Nevadas en Nueva Gales del Sur")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rana)));

        LatLng goli = new LatLng(4.6125522, 13.1535811);
        mMap.addMarker(new MarkerOptions().position(goli).title("Rana Goliat").snippet("Se encuentra en el sudoeste de Camerún y en Guinea Ecuatorial continental.")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.rana)));



        mMap.moveCamera(CameraUpdateFactory.newLatLng(sala));
    }
}
